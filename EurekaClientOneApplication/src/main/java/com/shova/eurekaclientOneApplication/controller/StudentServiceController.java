package com.shova.eurekaclientOneApplication.controller;

import com.shova.eurekaclientOneApplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentServiceController {

    @GetMapping("/liststudent/{className}")
    public List<Student> getStudents1(@PathVariable String className) {
        String classNames = className;
        ArrayList<Student> schoolDB = new ArrayList<>();
        List<Student> list = new ArrayList<>();
        Student std1 = new Student("Adam", classNames);
        Student std2 = new Student("Tom", classNames);
        Student std3 = new Student("Fink", classNames);
        Student std4 = new Student("James", classNames);
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);

        return list;
    }


}
