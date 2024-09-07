package com.kabin.SpringSecTelusko.service;

import com.kabin.SpringSecTelusko.model.Users;
import com.kabin.SpringSecTelusko.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JWTService jwtService;

    @Autowired
    private UserRepo userRepo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    @Autowired
    private AuthenticationManager authenticationManager;

    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
      return userRepo.save(user);
    }

    //return list of users
    public Iterable<Users> getAllUsers() {
        return userRepo.findAll();
    }

    public String verify(Users users) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(users.getUsername(),
                        users.getPassword()));
        if (authentication.isAuthenticated()) {
         //   return "User authenticated successfully";
            return jwtService.generateToken(users.getUsername());
        } else {
            return "Invalid username or password";
        }
    }
}
