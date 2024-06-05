package com.Springboot.Miniproject.controller;

import com.Springboot.Miniproject.entity.Common;
import com.Springboot.Miniproject.entity.Demand;
import com.Springboot.Miniproject.entity.Member;

import com.Springboot.Miniproject.methods.DemandI;
import com.Springboot.Miniproject.methods.Inter;
import com.Springboot.Miniproject.repo.Repo;
import com.Springboot.Miniproject.repo.Repo1;
import com.Springboot.Miniproject.repo.Repo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.random;

@RestController
public class Controller {
    @Autowired
    Inter obj;
    @Autowired
    DemandI dem;
    @Autowired
    Repo2 rep2;
    @Autowired
    Repo1 rep;
    @Autowired
    Repo re;
    @PostMapping("/members")
    public Member addMapper(@RequestBody Member member){
        return obj.addMapper(member);
    }

    @GetMapping("/demandMappers")
    public List<Member> getDemandMappers(@RequestBody Demand demand)
    {
        List<Member> l=re.getDemandMappers(demand.id, demand.city, demand.status,demand.level);
        List<Member> k=new ArrayList<>();
        if(demand.skills!=null && l!=null) {
            int y = demand.skills.size();
            for(Member m:l){
                int i=0;
                for(String s:demand.skills){
                    if(m.skills.containsKey(s)){
                        i++;
                    }
                }
                if(i==y)
                    k.add(m);
            }
            Collections.sort(k,Comparator.comparing(Member::getDoj).thenComparing(Member::getFirst_name).thenComparing(Member::getCity));
            Long ran=k.get(0).id;

            rep.save(demand);
            demand.setStatus("Closed");



            l.get(0).setStatus("Assigned");
            obj.addMapper(l.get(0));
            Common c=new Common();
            c.setId(demand.id);
            c.setEid(k.get(0).eid);
            c.setName(k.get(0).first_name);
            c.setProj_name(demand.proj_name);
            rep2.save(c);
            return k;
        }
        Collections.sort(l,Comparator.comparing(Member::getDoj).thenComparing(Member::getFirst_name).thenComparing(Member::getCity));
        Long ran=l.get(0).id;

        rep.save(demand);
        demand.setStatus("Closed");
        l.get(0).setStatus("Assigned");
        obj.addMapper(l.get(0));
        Common c=new Common();
        c.setId(demand.id);
        c.setEid(k.get(0).eid);
        c.setName(k.get(0).first_name);
        c.setProj_name(demand.proj_name);
        rep2.save(c);
        return l;
    }

    @GetMapping("/demand1")
    public Member getMapper(){

        for(Member m:re.findAll()){
            if(m.status.equals("Assigned")) {
                return m;
            }
        }


         return null;
    }

    @GetMapping("/members")
    public List<Member> getMappers(){

        return obj.getMappers();
    }
    @GetMapping("/demands")
    public List<Demand> getDemands(){

        return dem.getDemands();
    }






















    @GetMapping("/demandbyid")
    public List<Demand> getDemandID(@Param("id,city,status,skills1")Long id,String city,String status,ArrayList<String> skills1, @RequestParam(required = false)ArrayList<String> skills){
        List<Demand> l=rep.getDemandID(id,city,status,skills1);
        ArrayList<Demand> P=new ArrayList<>();
        for(Demand d:l){
            int count=0;
            for(String s:skills){
                if(d.skills.contains(s)){
                    count++;

                }
            }
            if(count==skills.size())
                P.add(d);
        }
        return P;
    }

    @PostMapping("/demand")
    public Demand postDemand(@RequestBody Demand demand){
        return dem.postDemand(demand);
    }
}
