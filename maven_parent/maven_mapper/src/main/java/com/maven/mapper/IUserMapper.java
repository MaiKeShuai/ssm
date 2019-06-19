package com.maven.mapper;

import com.maven.domain.UserInfo;

import java.util.List;

public interface IUserMapper {
    UserInfo loadUserByUsername(String username);

    List<UserInfo> findAll();

    void save(UserInfo userInfo);
}
