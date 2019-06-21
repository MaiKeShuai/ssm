package com.maven.mapper;

import com.maven.domain.Role;

import java.util.List;

public interface IRoleMapper {
    List<Role> findAll();

    void save(Role role);
}
