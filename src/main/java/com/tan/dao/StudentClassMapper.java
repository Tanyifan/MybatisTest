package com.tan.dao;

import com.tan.entity.StudentClass;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(StudentClass record);

    int insertSelective(StudentClass record);

    StudentClass selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(StudentClass record);

    int updateByPrimaryKey(StudentClass record);
}