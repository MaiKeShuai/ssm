package com.maven.service.impl;

import com.maven.domain.Product;
import com.maven.mapper.IProductMapper;
import com.maven.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper iProductMapper;

    public List<Product> findAll() {
        return iProductMapper.findAll();
    }

    public void saveProduct(Product product) {
        iProductMapper.saveProduct(product);
    }
}
