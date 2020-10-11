package com.huang.dao;

import com.huang.pojo.User;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :huangao
 */
public class UserMapperTest {

   Logger logger = Logger.getLogger(UserMapperTest.class);

    //测试按id查询
    @Test
    public void getUserById(){
        logger.info("进入getUserById测试方法：");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

}
