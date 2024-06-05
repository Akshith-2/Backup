package com.Springboot.Miniproject.methods;

import com.Springboot.Miniproject.entity.Demand;
import com.Springboot.Miniproject.entity.Member;

import java.util.List;


public interface Inter {

    public List<Member> getDemandMappers(Demand demand);
    public Member getMatchedMember();
    public List<Member> getMappers();
    public Member addMapper(Member member);


}
