package com.Springboot.Miniproject.repo;


import com.Springboot.Miniproject.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Member,Long> {

    @Query(value = "SELECT * FROM MEMBER m WHERE (:id is null or id=:id) AND (:city is null or m.city = :city) AND (:status is null or m.status = :status) AND (:level is null or m.level=:level);",nativeQuery = true)
    public List<Member> getDemandMappers(Long id,String city, String status,String level);





}
