package com.maven.controller;

import com.maven.domain.Items;
import com.maven.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail.do")
    public String findDetail(Model model){
        Items items = itemsService.findDetail(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
