package com.st.afw.webapi.test.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
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
public class IndexControllerOOCTest extends AbstractOOCTest{
    @Autowired
    protected WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception{
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  //初始化MockMvc对象
    }

    @Test
    public void testWelcome() throws Exception{
        String respStr = mockMvc.perform(MockMvcRequestBuilders.get("/welcome")
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn().getResponse().getContentAsString();
    }
}
