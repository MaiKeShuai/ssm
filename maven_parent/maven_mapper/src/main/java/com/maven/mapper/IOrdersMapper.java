package com.maven.mapper;

import com.maven.domain.Orders;

import java.util.List;

public interface IOrdersMapper {
    List<Orders> findAll();
}
