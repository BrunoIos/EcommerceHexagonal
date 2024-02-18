package com.brunoias.ecommerce.backend.domain.port;

import com.brunoias.ecommerce.backend.domain.model.Product;

public interface IProductRepository {
    Product save(Product product);

    Iterable<Product> findAll();

    Product findById(Integer id);

    void deleteByID(Integer id);
}
