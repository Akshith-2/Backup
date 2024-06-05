package com.Springboot.Miniproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

import java.util.HashMap;


@Entity
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String eid,first_name,last_name,level,city,status="Available";
    public int overall_exp;
    public HashMap<String,Integer> skills;

    public Date doj;

    public Member(Long id, String eid, String first_name, String last_name, String level, String city, String status, int overall_exp, HashMap<String, Integer> skills, Date doj) {
        this.id = id;
        this.eid = eid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.level = level;
        this.city = city;
        this.status = status;
        this.overall_exp = overall_exp;
        this.skills = skills;
        this.doj = doj;

    }

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOverall_exp() {
        return overall_exp;
    }

    public void setOverall_exp(int overall_exp) {
        this.overall_exp = overall_exp;
    }

    public HashMap<String, Integer> getSkills() {

        return skills;
    }

    public void setSkills(HashMap<String, Integer> skills) {
        this.skills = skills;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", eid='" + eid + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", level='" + level + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                ", overall_exp=" + overall_exp +
                ", skills=" + skills +
                ", doj='" + doj + '\'' +
                '}';
    }
}
