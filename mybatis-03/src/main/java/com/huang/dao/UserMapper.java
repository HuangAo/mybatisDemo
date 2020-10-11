package com.huang.dao;

import com.huang.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * 使用注解方式开发Mapper
 * 只适用于简单的sql，复杂的应用xml方式
 * @author :huangao
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUserById(int id);

    @Update("update user set name = #{name},pwd = #{pwd} where id = #{id}")
    int updateUser(User user);

}
