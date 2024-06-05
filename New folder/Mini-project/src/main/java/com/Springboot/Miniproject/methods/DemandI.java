package com.Springboot.Miniproject.methods;

import com.Springboot.Miniproject.entity.Demand;


import java.util.List;

public interface DemandI {
    public Demand postDemand(Demand demand);

    public List<Demand> getDemands();
}
