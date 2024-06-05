package com.Springboot.Miniproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Common {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String eid,name,proj_name;

    public Common(Long id, String eid, String name, String proj_name) {
        this.id = id;
        this.eid = eid;
        this.name = name;
        this.proj_name = proj_name;
    }

    public Common() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }
}
