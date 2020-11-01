package com.sebastian.uts.market.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.sebastian.uts.market.persistence.entity.Producto;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductoCrudRepository extends CrudRepository< Producto, Integer> {
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) -> metodo de para hacer consultas con metodos nativos 
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer IdCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer CantidadStock, Boolean Estado );
    
}
