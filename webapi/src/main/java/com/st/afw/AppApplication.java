package com.st.afw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@ServletComponentScan
@PropertySource({"app.properties","classpath:application-dao.properties"})
public class AppApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(AppApplication.class,args);
    }


}
