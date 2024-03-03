package com.brunoias.ecommerce.backend.infrastructure.adapter;

import com.brunoias.ecommerce.backend.domain.model.Product;
import com.brunoias.ecommerce.backend.domain.port.IProductRepository;
import com.brunoias.ecommerce.backend.infrastructure.mapper.ProductMapper;

public class ProductCrudRepositoryImpl implements IProductRepository {
    private final IProductCrudRepository iProductCrudRepository;

    private final ProductMapper productMapper;

    public ProductCrudRepositoryImpl(IProductCrudRepository iProductCrudRepository, ProductMapper productMapper) {
        this.iProductCrudRepository = iProductCrudRepository;
        this.productMapper = productMapper;
    }


    @Override
    public Product save(Product product) {
        return productMapper.toProduct(productMapper.toProductEntity(product));
    }

    @Override
    public Iterable<Product> findAll() {
        return productMapper.toProducts(iProductCrudRepository.findAll());
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.toProduct(iProductCrudRepository.findById(id).get());
    }

    @Override
    public void deleteByID(Integer id) {
        iProductCrudRepository.deleteById(id);
    }
}
