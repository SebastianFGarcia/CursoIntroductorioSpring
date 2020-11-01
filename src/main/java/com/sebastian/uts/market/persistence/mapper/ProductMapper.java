package com.sebastian.uts.market.persistence.mapper;

import java.util.List;

import com.sebastian.uts.market.domain.Product;
import com.sebastian.uts.market.persistence.entity.Producto;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
        @Mapping(source = "IdProducto", target = "productId"),
        @Mapping(source = "Nombre", target = "name"),
        @Mapping(source = "IdCategoria", target = "categoryId"),
        @Mapping(source = "PrecioVenta", target = "price"),
        @Mapping(source = "CantidadStock", target = "stock"),
        @Mapping(source = "Estado", target = "active"),
        @Mapping(source = "categoria", target = "category"),


    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
    
}
