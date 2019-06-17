package com.maven.controller;

import com.github.pagehelper.PageInfo;
import com.maven.domain.Product;
import com.maven.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    //分页查询产品列表
    @RequestMapping("/findAllPage.do")
    public ModelAndView findAllPage(@RequestParam(name = "page",defaultValue = "1",required = true) int page,
                                    @RequestParam(name = "size",defaultValue = "3",required = true) int size){

        ModelAndView mv = new ModelAndView();
        List<Product> productList = productService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(productList);

        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");

        return mv;
    }

    @RequestMapping("/saveProduct.do")
    public String addProduct(Product product){
        productService.saveProduct(product);
        //重定向
        return "redirect:findAllPage.do?page=1&size=3";
    }
}
