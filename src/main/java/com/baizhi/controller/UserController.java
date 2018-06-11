package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping (value="/add")
    public String addUser(@ModelAttribute("user")User user){
        userService.insertUser(user);
        System.out.println("+++++");
        return "index.jsp";
    }
    @RequestMapping(value="/login",produces = {})
    public ModelAndView login(User user){
        ModelAndView mv=new ModelAndView("index");
        User us=userService.selectUser(user);
        return mv;
    }
}
