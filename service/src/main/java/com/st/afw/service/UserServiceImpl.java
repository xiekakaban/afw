package com.st.afw.service;

import com.st.afw.dao.UserMapper;
import com.st.afw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> all() {
        return userMapper.getAllUsers();
    }
}
