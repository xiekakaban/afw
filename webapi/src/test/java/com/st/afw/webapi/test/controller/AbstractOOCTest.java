package com.st.afw.webapi.test.controller;

import com.st.afw.webapi.test.BaseOOCTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=BaseOOCTest.class)
@WebAppConfiguration
public abstract class AbstractOOCTest {
}
