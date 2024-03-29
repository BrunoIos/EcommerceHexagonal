package com.brunoias.ecommerce.backend.domain.port;

import com.brunoias.ecommerce.backend.domain.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository {
    Category save (Category category);
    Iterable<Category> findAll();
    Category findById(Integer id);
    void deleteById (Integer id);
}
