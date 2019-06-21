package com.maven.mapper;

import com.maven.domain.Permission;

import java.util.List;

public interface IPermissionMapper {
    List<Permission> findAll();

    void save(Permission permission);
}
