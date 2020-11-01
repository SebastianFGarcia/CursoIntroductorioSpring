package com.sebastian.uts.market.persistence.mapper;

import com.sebastian.uts.market.domain.Category;
import com.sebastian.uts.market.persistence.entity.Categoria;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "IdCategoria",  target = "categoryId"),
        @Mapping(source = "Descripcion",  target = "category"),
        @Mapping(source = "Estado",  target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
