package com.tan.service;

import com.tan.entity.Student;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/16
 */
public interface IStudentService {

    int deleteByPrimaryKey(Integer uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectByCondition(Student record);
}
