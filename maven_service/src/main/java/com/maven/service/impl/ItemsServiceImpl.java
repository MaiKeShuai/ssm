package com.maven.service.impl;

import com.maven.domain.Items;
import com.maven.mapper.ItemsMapper;
import com.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public Items findDetail(Integer id) {
        Items items = itemsMapper.findDetail(id);
        return items;
    }
}
