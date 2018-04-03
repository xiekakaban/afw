package com.st.afw.controller;

import com.st.afw.entity.User;
import com.st.afw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by bobo on 2018/4/3.
 *
 * @email ruantianbo@163.com
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("allUsers")
    @ResponseBody
    public List<User> findAllUser(){
        return userService.findAll();
    }
}
