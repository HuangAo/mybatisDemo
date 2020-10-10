package com.huang.dao;

import com.huang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
public interface UserMapper {

    List<User> getUsers();

    User getUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    //使用Map传参
    int updateUser2(Map<String, Object> map);
}
