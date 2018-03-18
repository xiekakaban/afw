package com.st.afw.webapi.test;


import com.st.afw.AppApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.st.afw.webapi")
public class BaseOOCTest{

    public static void main( String[] args ) {
        SpringApplication.run(BaseOOCTest.class,args);
    }

}