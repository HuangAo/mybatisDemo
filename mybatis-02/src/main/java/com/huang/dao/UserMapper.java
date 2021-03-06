package com.huang.dao;

import com.huang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
public interface UserMapper {

    User getUserById(int id);

    //分页
    List<User> getUsersByLimit(Map<String,Object> map);
}
