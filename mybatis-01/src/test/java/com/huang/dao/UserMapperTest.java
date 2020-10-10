package com.huang.dao;

import com.huang.pojo.User;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
public class UserMapperTest {

    //测试查询所有
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUsers();
        for(User user: userList){
            System.out.println(user);
        }
        sqlSession.close();
    }

    //测试按id查询
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    //测试新增
    //增、删、改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(4,"kobe","9898777");
        int result = userMapper.addUser(user);
        if(result==1){
            System.out.println("新增成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }

    //测试删除User
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int result = userMapper.deleteUserById(4);
        if(result==1){
            System.out.println("删除成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }

    //修改User
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(1,"huang","123456");
        int result = userMapper.updateUser(user);
        if(result==1){
            System.out.println("修改成功");
            sqlSession.commit();
        }
        sqlSession.close();

    }

    //修改User，使用Map传参
    @Test
    public void updateUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 2);
        map.put("pass", "fuckyou");
        int result = userMapper.updateUser2(map);
        if(result==1){
            System.out.println("修改成功");
            sqlSession.commit();
        }
        sqlSession.close();

    }
}
