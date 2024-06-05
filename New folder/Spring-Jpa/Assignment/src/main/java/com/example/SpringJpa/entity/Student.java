package com.example.SpringJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    private String name,status,address;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Student(String name,String address,int age,String status,Long id) {
        this.name=name;
        this.address=address;
        this.age=age;
        this.status=status;
        this.id=id;
    }

    public Student(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
