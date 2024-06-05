package com.Springboot.Miniproject.methods;

import com.Springboot.Miniproject.entity.Common;

import com.Springboot.Miniproject.repo.Repo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommonI implements Common1 {
    @Autowired
    Repo2 rep3;

    public Common postCommon(Common common){
        return rep3.save(common);
    }
    public List<Common> getCommon(){
        return rep3.findAll();
    }

}
