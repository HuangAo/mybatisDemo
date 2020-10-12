package com.huang.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author :huangao
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
