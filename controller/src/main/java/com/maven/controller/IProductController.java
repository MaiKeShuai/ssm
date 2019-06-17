package com.maven.controller;

import com.maven.domain.Product;
import com.maven.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;

@Controller
@RequestMapping("/product")
public class IProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();

        List<Product> productList = productService.findAll();

        mv.addObject("productList",productList);
        mv.setViewName("product-list");

        return mv;
    }

    @RequestMapping("/saveProduct.do")
    public String addProduct(Product product){
        productService.saveProduct(product);
        //重定向
        return "redirect:findAll.do";
    }
}
