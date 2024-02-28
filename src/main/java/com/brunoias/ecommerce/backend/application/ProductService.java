package com.brunoias.ecommerce.backend.application;

import com.brunoias.ecommerce.backend.domain.model.Product;
import com.brunoias.ecommerce.backend.domain.port.IProductRepository;


public class ProductService {

    final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    Product save(Product product) {
        return this.productRepository.save(product);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Integer id) {
        return this.productRepository.findById(id);
    }

}
