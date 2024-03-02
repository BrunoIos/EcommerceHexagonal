package com.brunoias.ecommerce.backend.infrastructure.adapter;

import com.brunoias.ecommerce.backend.domain.model.Category;
import com.brunoias.ecommerce.backend.domain.port.ICategoryRepository;
import com.brunoias.ecommerce.backend.infrastructure.mapper.CategoryMapper;

public class CategoryCrudRepositoryImpl implements ICategoryRepository {

    private final iCategoryCrudRepository iCategoryCrudRepository;

    private final CategoryMapper categoryMapper;

    public CategoryCrudRepositoryImpl(com.brunoias.ecommerce.backend.infrastructure.adapter.iCategoryCrudRepository iCategoryCrudRepository, CategoryMapper categoryMapper) {
        this.iCategoryCrudRepository = iCategoryCrudRepository;
        this.categoryMapper = categoryMapper;
    }


    @Override
    public Category save(Category category) {
        return categoryMapper.toCategory(iCategoryCrudRepository.save(categoryMapper.toCategoryEntity(category)));
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryMapper.toCategories(iCategoryCrudRepository.findAll());
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.toCategory(iCategoryCrudRepository.findById(id).orElseThrow(() -> new RuntimeException("Category with id" + id + "do not exist")));
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryCrudRepository.deleteById(id);
    }
}
