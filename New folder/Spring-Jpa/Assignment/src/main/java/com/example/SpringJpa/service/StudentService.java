package com.example.SpringJpa.service;

import com.example.SpringJpa.entity.Student;
import com.example.SpringJpa.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class StudentService implements StudentServiceI{
     @Autowired
    public StudentRepository studentRepository;
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> fetchStudentList() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student student1=studentRepository.findById(id).get();
        if(Objects.nonNull(student.getName())&&!"".equalsIgnoreCase(student.getName())){
            student1.setName(student.getName());
        }
        if(Objects.nonNull(student.getStatus())&&!"".equalsIgnoreCase(student.getStatus())){
            student1.setStatus(student.getStatus());
        }
        if(Objects.nonNull(student.getAddress())&&!"".equalsIgnoreCase(student.getAddress())){
            student1.setAddress(student.getAddress());
        }


        return studentRepository.save(student1);
    }
    public String deleteAll(){
        studentRepository.deleteAll();
        return "";
    }
}
