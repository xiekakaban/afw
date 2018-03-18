package com.st.afw.dao;

import com.st.afw.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by bobo on 2018/3/18.
 *
 * @email ruantianbo@163.com
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM tb_user")
    public List<User> getAllUsers();
}
