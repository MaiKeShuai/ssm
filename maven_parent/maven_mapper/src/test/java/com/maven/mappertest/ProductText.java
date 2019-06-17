package com.maven.mappertest;

import com.maven.domain.Product;
import com.maven.mapper.IProductMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductText {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext-Mapper.xml");
        IProductMapper bean = app.getBean(IProductMapper.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
