package com.maven.controller;

import com.maven.domain.UserInfo;
import com.maven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class IUserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();

        List<UserInfo> userInfoList = userService.findAll();

        mv.addObject("userList",userInfoList);
        mv.setViewName("user-list");

        return mv;
    }

    @RequestMapping("/save.do")
    public String save(UserInfo userInfo){
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById")
    public ModelAndView findById(String id){
        ModelAndView mv = new ModelAndView();

        UserInfo userInfo = userService.findById(id);

        mv.addObject("user",userInfo);
        mv.setViewName("user-show");

        return mv;
    }
}
