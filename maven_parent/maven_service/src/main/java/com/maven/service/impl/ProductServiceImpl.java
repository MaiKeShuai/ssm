package com.maven.service.impl;

import com.github.pagehelper.PageHelper;
import com.maven.domain.Product;
import com.maven.mapper.IProductMapper;
import com.maven.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper iProductMapper;

    public List<Product> findAll() {
        return iProductMapper.findAll();
    }

    public List<Product> findAll(int page, int size) {
        PageHelper.startPage(page,size);
        return iProductMapper.findAll();
    }

    public void saveProduct(Product product) {
        iProductMapper.saveProduct(product);
    }
}
