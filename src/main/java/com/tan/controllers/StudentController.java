package com.tan.controllers;

import com.tan.entity.Student;
import com.tan.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/16
 */
@Controller
public class StudentController {

    @Autowired
    private IStudentService service;

    @RequestMapping(value = "/Student",method = RequestMethod.GET)
    public String get(Model model) {
        List<Student> students = service.selectByCondition(new Student());
        Student s = students.get(0);
//        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        model.addAttribute(s);
        return "student";
    }
}
