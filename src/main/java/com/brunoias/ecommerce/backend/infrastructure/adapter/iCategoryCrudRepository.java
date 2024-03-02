package com.brunoias.ecommerce.backend.infrastructure.adapter;

import com.brunoias.ecommerce.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface iCategoryCrudRepository extends CrudRepository <CategoryEntity, Integer>{
}
