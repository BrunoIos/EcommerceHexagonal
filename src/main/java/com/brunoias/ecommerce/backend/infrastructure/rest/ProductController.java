package com.brunoias.ecommerce.backend.infrastructure.rest;

import com.brunoias.ecommerce.backend.application.ProductService;
import com.brunoias.ecommerce.backend.domain.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("{id}")
    public Product save(@PathVariable Integer id) {
        return productService.findById(id);
    }

    @GetMapping()
    public Iterable<Product> findAll() {
        return productService.findAll();
    }


}
