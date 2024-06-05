package com.Springboot.Miniproject.repo;

import com.Springboot.Miniproject.entity.Demand;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface Repo1 extends JpaRepository<Demand,Long> {

    @Query(value="SELECT * FROM DEMAND WHERE (:id is null or id=:id) AND (:city is null or city=:city) AND (:status is null or status=:status) AND (:skills is null);",nativeQuery = true)
    public List<Demand> getDemandID(Long id, String city, String status,ArrayList<String> skills);


}


