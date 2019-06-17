package com.maven.mapper;

import com.maven.domain.Product;

import java.util.List;

public interface IProductMapper {
    List<Product> findAll();

    void saveProduct(Product product);

    Product findProductById(String id);
}
