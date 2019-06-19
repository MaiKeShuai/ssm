package com.maven.service.impl;

import com.maven.domain.Role;
import com.maven.domain.UserInfo;
import com.maven.mapper.IUserMapper;
import com.maven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userMapper.findAll(username);


        List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
        List<Role> roleList = userInfo.getRoles();
        for (Role role : roleList) {
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }



        User user = new User(userInfo.getUsername(),
                "{noop}"+userInfo.getPassword(),
                userInfo.getStatus() == 0 ? false :true,
                true, true, true, list);

        return user;
    }

}
