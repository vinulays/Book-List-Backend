package com.springboot.jpa.controller;

import com.springboot.jpa.domain.User;
import com.springboot.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/login")
    public List<User> getUsers(){
        return userRepository.findAll();

    }
    @PostMapping("/login")
    public User login(@RequestBody User user){
        Optional<User> userResult = userRepository.findByEmail(user.getEmail());
        if (userResult.isPresent()){
            if (userResult.get().getPassword().equals(user.getPassword())){
                return userResult.get();
            }else{
                return null;
            }
        }

        return null;
    }
    @PostMapping("/login/create")
    public void createUser(@RequestBody User user){
        userRepository.save(user);

    }


}
