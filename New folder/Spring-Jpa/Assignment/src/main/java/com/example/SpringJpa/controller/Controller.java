package com.example.SpringJpa.controller;


import com.example.SpringJpa.entity.Student;


import com.example.SpringJpa.repo.StudentRepository;
import com.example.SpringJpa.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    public StudentServiceI studentService;
    @Autowired
    public StudentRepository repo;

    @GetMapping("/Students")
    public List<Student> fetchStudentList(){

        return studentService.fetchStudentList();
    }

    @GetMapping("/Students/{sid}")
    public Student getStudentById(@PathVariable("sid") Long id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/Students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/Students/{sid}")
    public void deleteStudentById(@PathVariable("sid") Long id){
        studentService.deleteStudentById(id);
    }

    @PutMapping("/Students/{sid}")
    public Student updateStudent(@PathVariable("sid") Long id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("/Students")
    public String deleteAll(){
        studentService.deleteAll();
        return "Deleted Successfully";
    }



    @GetMapping("/studentscage")
    public List<Student> getStudentsWithCandAge20(){
        
       List<Student> list1=repo.getStudentsWithCandAge20();
        return list1;
    }

    @GetMapping("/studentsage")
    public List<Student> getStudentsWithAge18(){

        List<Student> list2=repo.getStudentsWithAge18();
        return list2;
    }
    @DeleteMapping("/dela")
    public String getStudentsdelA(){
       repo.getStudentsDelA();
       return "Deleted Successfully";
    }
    @PutMapping("/upda")
    public String getStudentsuA(){
        repo.getStudentsuA();
        return "Updated Successfully";
    }
}

