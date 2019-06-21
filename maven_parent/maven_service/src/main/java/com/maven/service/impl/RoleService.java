package com.maven.service.impl;

import com.maven.domain.Role;
import com.maven.mapper.IRoleMapper;
import com.maven.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    @Autowired
    private IRoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        List<Role> roleList = roleMapper.findAll();
        return roleList;
    }

    @Override
    public void save(Role role) {
        roleMapper.save(role);
    }
}
