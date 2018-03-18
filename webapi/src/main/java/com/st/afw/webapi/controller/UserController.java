package com.st.afw.webapi.controller;

import com.st.afw.model.User;
import com.st.afw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> listUsers(){
        return userService.all();
    }
}
