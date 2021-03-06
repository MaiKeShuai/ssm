package com.maven.service.impl;

import com.maven.domain.Role;
import com.maven.domain.UserInfo;
import com.maven.mapper.IUserMapper;
import com.maven.service.IUserService;
import com.maven.util.BCryptPasswordEncoderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userMapper.loadUserByUsername(username);


        List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
        List<Role> roleList = userInfo.getRoles();
        for (Role role : roleList) {
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }


        User user = new User(userInfo.getUsername(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false :true,
                true, true, true, list);

        return user;
    }

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfoList = userMapper.findAll();
        return userInfoList;
    }

    @Override
    public void save(UserInfo userInfo) {
        //密码进行加密
        userInfo.setPassword(BCryptPasswordEncoderUtils.encode(userInfo.getPassword()));
        userMapper.save(userInfo);
    }

    @Override
    public UserInfo findById(String id) {
        UserInfo userInfo = userMapper.findById(id);
        return userInfo;
    }
}
