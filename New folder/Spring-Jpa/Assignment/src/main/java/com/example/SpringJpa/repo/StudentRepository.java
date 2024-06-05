package com.example.SpringJpa.repo;

import com.example.SpringJpa.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query(value = "SELECT * FROM STUDENT WHERE name like 'C%' AND age > 20;",nativeQuery = true)
    public List<Student> getStudentsWithCandAge20();

    @Query(value = "SELECT * FROM STUDENT WHERE age > 18;",nativeQuery = true)
    public List<Student> getStudentsWithAge18();
    @Modifying
    @Query(value = "DELETE FROM STUDENT WHERE name LIKE 'A%';",nativeQuery = true)
    public void getStudentsDelA();

    @Modifying
    @Query(value = "UPDATE STUDENT SET AGE=20 WHERE AGE>20;",nativeQuery = true)
    public void getStudentsuA();
}
