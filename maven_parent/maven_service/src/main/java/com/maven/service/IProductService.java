package com.maven.service;

import com.maven.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    List<Product> findAll(int page,int size);

    void saveProduct(Product product);
}
