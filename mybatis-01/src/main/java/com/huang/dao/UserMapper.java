package com.huang.dao;

import com.huang.pojo.User;

import java.util.List;

/**
 * @author :huangao
 */
public interface UserMapper {

    List<User> getUsers();

    User getUserById(int id);

    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);
}
