package com.xa.crmgena.jwtauth.controllers;


import com.xa.crmgena.jwtauth.models.User;
import com.xa.crmgena.jwtauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<User> getAll(){
        return userRepository.findAll();
    }


    @GetMapping("/moderator")
    @PreAuthorize("hasRole('MODERATOR')")
    public List<User> getAllModerator(){
        return userRepository.findAll();
    }

    @GetMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllAdminDashbord(){
        return userRepository.findAll();
    }

}
