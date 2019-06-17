package com.maven.service.impl;

import com.maven.domain.Orders;
import com.maven.mapper.IOrdersMapper;
import com.maven.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersMapper ordersMapper;

    public List<Orders> findAll() {
        return ordersMapper.findAll();
    }
}
