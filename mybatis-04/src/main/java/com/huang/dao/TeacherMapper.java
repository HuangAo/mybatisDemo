package com.huang.dao;

import com.huang.pojo.Teacher;

import java.util.List;

/**
 * @author :huangao
 */
public interface TeacherMapper {

    List<Teacher> getTeachers();

    Teacher getTeacherById(int id);
}
