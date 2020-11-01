package com.sebastian.uts.market.persistence;

import java.util.List;
import java.util.Optional;

import com.sebastian.uts.market.persistence.crud.ProductoCrudRepository;
import com.sebastian.uts.market.persistence.entity.Producto;

import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {
    
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(Integer idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(Integer cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
   }

   public Optional<Producto> getProducto(Integer idProducto){
       return productoCrudRepository.findById(idProducto);
   }
   
   public Producto save( Producto producto){
       return productoCrudRepository.save(producto);
   }

   public void delete(Integer idProducto){
       productoCrudRepository.deleteById(idProducto);
   }
}
