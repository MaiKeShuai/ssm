package com.maven.service.impl;

import com.maven.domain.Permission;
import com.maven.mapper.IPermissionMapper;
import com.maven.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionMapper permissionMapper;

    @Override
    public List<Permission> findAll() {
        List<Permission> permissionList = permissionMapper.findAll();
        return permissionList;
    }

    @Override
    public void save(Permission permission) {
        permissionMapper.save(permission);
    }
}
