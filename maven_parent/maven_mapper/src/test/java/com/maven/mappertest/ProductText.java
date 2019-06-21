package com.maven.mappertest;

import com.maven.domain.Product;
import com.maven.domain.Role;
import com.maven.domain.UserInfo;
import com.maven.mapper.IProductMapper;
import com.maven.mapper.IRoleMapper;
import com.maven.mapper.IUserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductText {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext-Mapper.xml");
        IProductMapper bean = app.getBean(IProductMapper.class);
//        List<Product> all = bean.findAll();
//        for (Product product : all) {
//            System.out.println(product);
//        }
//        Product product = bean.findProductById("676C5BD1D35E429A8C2E114939C5685A");
//        System.out.println(product);

//        IUserMapper bean1 = app.getBean(IUserMapper.class);
////        UserInfo byId = bean1.findById("515E16B30091434EB366D142DDDA8831");
//        bean1.

        IRoleMapper bean1 = app.getBean(IRoleMapper.class);
        Role role = new Role();
        role.setRoleName("CVIP");
        role.setRoleDesc("超级管理员");
        bean1.save(role);


    }
    @Test
    public void findByIdOrders(){
//        ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext-Mapper.xml");
//        app.getBean()
    }
}
