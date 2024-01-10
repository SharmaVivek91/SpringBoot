package com.example.demo;

import com.example.demo.rest.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("Test Name");
        student.setCourse("Test Course");
        student.setMajor("Test Major");

        Student student1 = new Student();
        student1.setName("Test Name 1");
        student1.setCourse("Test Course 1");
        student1.setMajor("Test Major 1");

        Student student2 = new Student();
        student2.setName("Test Name 2");
        student2.setMajor("Test Major 2");
        student2.setCourse("Test Course 2");

        students.add(student);
        students.add(student1);
        students.add(student2);

        return students;
    }
}
