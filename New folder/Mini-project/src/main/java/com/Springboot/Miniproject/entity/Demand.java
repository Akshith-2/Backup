package com.Springboot.Miniproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.sql.Date;

@Entity
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String proj_name,mgr_name,city,level,dur,status;
    public Date startDate;
    public ArrayList<String> skills;




    public Demand() {
    }

    public Demand(Long id, String proj_name, String mgr_name, String city, String level, String dur, Date startDate, ArrayList<String> skills, String status) {
        this.id = id;
        this.proj_name = proj_name;
        this.mgr_name = mgr_name;
        this.city = city;
        this.level = level;
        this.dur = dur;
        this.startDate = startDate;
        this.skills = skills;
        this.status=status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMgr_name() {
        return mgr_name;
    }

    public void setMgr_name(String mgr_name) {
        this.mgr_name = mgr_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }

    public String getDur() {
        return dur;
    }

    public void setDur(String dur) {
        this.dur = dur;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
