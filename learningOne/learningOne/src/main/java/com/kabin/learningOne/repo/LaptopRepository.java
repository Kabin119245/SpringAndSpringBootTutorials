package com.kabin.learningOne.repo;

import com.kabin.learningOne.model.Laptop;
import org.springframework.stereotype.Repository;


@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database......");
    }
}
