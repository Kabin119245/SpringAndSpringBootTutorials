package com.kabin.learningOne.service;

import com.kabin.learningOne.repo.LaptopRepository;
import com.kabin.learningOne.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {


    private LaptopRepository laprep;


    public LaptopRepository getLaprep() {
        return laprep;
    }


    @Autowired
    public void setLaprep(LaptopRepository laprep) {
        this.laprep = laprep;
    }

    public void addLaptop(Laptop lap) {


        System.out.println("Method is called");
        laprep.save(lap);

    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }





}
