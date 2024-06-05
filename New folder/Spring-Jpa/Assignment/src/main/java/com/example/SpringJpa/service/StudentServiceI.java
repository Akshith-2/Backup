package com.example.SpringJpa.service;

import com.example.SpringJpa.entity.Student;

import java.util.List;

public interface StudentServiceI {

    public Student getStudentById(Long id);
    public List<Student> fetchStudentList();
    public Student saveStudent(Student student);
    public void deleteStudentById(Long id);
    public Student updateStudent(Long id,Student student);
    public String deleteAll();
}
