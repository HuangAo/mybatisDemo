package com.huang;

import com.huang.dao.StudentMapper;
import com.huang.dao.TeacherMapper;
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
   public void getTeacherByIdTest(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void searchStudentTest(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student studentSearch = new Student();
        studentSearch.setName("小红");
        List<Student> students = studentMapper.searchStudent(studentSearch);
        for(Student student: students){
            System.out.println(student);
        }
        sqlSession.close();
    }

}
