package com.maven.service.impl;

import com.github.pagehelper.PageHelper;
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

    public List<Orders> findAll(int page, int size) {
        //在查询之前添加一条分页条件
        PageHelper.startPage(page,size);
        return ordersMapper.findAll();
    }

    public Orders findById(String id) {
        return ordersMapper.findById(id);
    }
}
