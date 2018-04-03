package com.st.afw.service;

import com.st.afw.entity.User;
import com.st.afw.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bobo on 2018/4/3.
 *
 * @email ruantianbo@163.com
 */
@Service("userService")
public class UserService {

    @Autowired
    private IUserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
