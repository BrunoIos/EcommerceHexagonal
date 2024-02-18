package com.brunoias.ecommerce.backend.application;

import com.brunoias.ecommerce.backend.domain.model.Category;
import com.brunoias.ecommerce.backend.domain.port.ICategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save (Category category){
        return this.categoryRepository.save(category);
    }

    public Iterable<Category> findAll(){
        return this.categoryRepository.findAll();
    }

    public  Category findById(Integer id){
        return this.categoryRepository.findById(id);
    }
}
