package com.brunoias.ecommerce.backend.infrastructure.mapper;

import com.brunoias.ecommerce.backend.domain.model.Category;
import com.brunoias.ecommerce.backend.domain.model.User;
import com.brunoias.ecommerce.backend.infrastructure.entity.CategoryEntity;
import com.brunoias.ecommerce.backend.infrastructure.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "name", target = "name"),
                    @Mapping(source = "dateCreated", target = "dateCreated"),
                    @Mapping(source = "dateUpdated", target = "dateUpdated"),
            }
    )
    Category toCategory(CategoryEntity categoryEntity);
    Iterable<Category>toCategories(Iterable<CategoryEntity> categoryEntity);
    @InheritInverseConfiguration
    CategoryEntity toCategoryEntity(Category category);}
