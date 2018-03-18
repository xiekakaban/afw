package com.st.afw.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@RestController
public class IndexController {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
