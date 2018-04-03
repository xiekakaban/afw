package com.st.afw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bobo on 2018/4/3.
 *
 * @email ruantianbo@163.com
 */
@SpringBootApplication
@Controller
public class AFWApplication {

    public static void main(String[] args){
        SpringApplication.run(AFWApplication.class,args);
    }

    @GetMapping("/welcome")
    @ResponseBody
    public String welcome(){
        return "welcome";
    }
}
