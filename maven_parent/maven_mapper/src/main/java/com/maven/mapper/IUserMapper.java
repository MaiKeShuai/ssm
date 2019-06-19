package com.maven.mapper;

import com.maven.domain.UserInfo;

public interface IUserMapper {
    UserInfo findAll(String username);
}
