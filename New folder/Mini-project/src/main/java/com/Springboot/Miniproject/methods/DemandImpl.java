package com.Springboot.Miniproject.methods;

import com.Springboot.Miniproject.entity.Demand;

import com.Springboot.Miniproject.repo.Repo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandImpl implements DemandI{

    @Autowired
    Repo1 rep;
    @Override
    public Demand postDemand(Demand demand) {
        return rep.save(demand);
    }

    @Override
    public List<Demand> getDemands() {
        return rep.findAll();
    }
}
