package com.Springboot.Miniproject.methods;

import com.Springboot.Miniproject.entity.Demand;
import com.Springboot.Miniproject.entity.Member;
import com.Springboot.Miniproject.repo.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class Impl implements Inter {
    @Autowired
    Repo sk;




    @Override
    public List<Member> getDemandMappers(Demand demand) {
        List<Member> h1=new ArrayList<>();
        List<Member> l=sk.findAll();
        int x=demand.skills.size();
        int i=0;
        for(Member mem:l){
            if(mem!=null) {
                for (String s : mem.skills.keySet()) {
                    for (String u : demand.skills) {
                        if (s.equals(u)) {
                            i++;
                        }
                    }
                }
                if(i==x){
                    h1.add(mem);
                }
                i=0;
            }

        }
        return h1;
    }

    @Override
    public Member getMatchedMember() {
        return null;
    }

    @Override
    public List<Member> getMappers() {
        return sk.findAll();
    }

    @Override
    public Member addMapper(Member member) {

        return sk.save(member);

    }




}
