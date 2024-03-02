package com.brunoias.ecommerce.backend.infrastructure.rest;

import com.brunoias.ecommerce.backend.application.CategoryService;
import com.brunoias.ecommerce.backend.domain.model.Category;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    private final CategoryService categoryService;


    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @GetMapping
    public Category category(@PathVariable Integer id) {
        return categoryService.findById(id);
    }
}
