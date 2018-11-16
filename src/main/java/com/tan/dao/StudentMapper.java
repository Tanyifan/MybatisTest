package com.tan.dao;

import com.tan.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectByCondition(Student record);
}