package com.maven.service;

import com.maven.domain.Permission;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll();

    void save(Permission permission);
}
