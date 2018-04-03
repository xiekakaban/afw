package com.st.afw.mapper;

import com.st.afw.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by bobo on 2018/4/3.
 *
 * @email ruantianbo@163.com
 */
public interface IUserMapper {

    @Select("select * from tb_user")
    List<User> findAll();
}
