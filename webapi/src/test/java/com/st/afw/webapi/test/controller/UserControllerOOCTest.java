package com.st.afw.webapi.test.controller;

import com.st.afw.AppApplication;
import com.st.afw.webapi.test.BaseOOCTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
public class UserControllerOOCTest extends AbstractOOCTest{

//    @Autowired
//    protected WebApplicationContext wac;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception{
//        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
//    }
//
//    @Test
//    public void testWelcome() throws Exception{
//
//        String responseString = mockMvc.perform(
//                MockMvcRequestBuilders.get("/welcome")          //请求的url,请求的方法是get
//                                .contentType(MediaType.APPLICATION_JSON)//数据的格式
//                        //.param("id","3")   //添加参数(可以添加多个)
//                )
//                .andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
//                .andDo(MockMvcResultHandlers.print())         //打印出请求和相应的内容
//                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
//        System.out.println("-----返回的json = " + responseString);
//    }
}
