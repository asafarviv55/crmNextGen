package com.xa.crmgena.jwtauth.controllers;


import com.xa.crmgena.jwtauth.models.User;
import com.xa.crmgena.jwtauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;



    @GetMapping("")
    public List<User> getAll(){
        return userRepository.findAll();
    }


}
