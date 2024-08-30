package com.kabin.SpringSecTelusko.service;

import com.kabin.SpringSecTelusko.model.Users;
import com.kabin.SpringSecTelusko.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users register(Users user) {
      return userRepo.save(user);
    }
}
