package com.huang.dao;

import com.huang.pojo.Student;

import java.util.List;

/**
 * @author :huangao
 */
public interface StudentMapper {

    List<Student> getStudents();

    List<Student> getStudents2();
}
