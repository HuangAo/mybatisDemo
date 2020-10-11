package com.huang.dao;

import com.huang.pojo.Student;
import com.huang.pojo.Teacher;
import com.huang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author :huangao
 */
public class TeacherMapperTest {

    @Test
    public void test1(){

        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudentsTest(){
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudents();

        for(Student student: studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void getStudentsTest2(){
        SqlSession sqlSession =  MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudents2();

        for(Student student: studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
