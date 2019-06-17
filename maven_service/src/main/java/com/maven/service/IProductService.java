package com.maven.service;

import com.maven.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void saveProduct(Product product);
}
