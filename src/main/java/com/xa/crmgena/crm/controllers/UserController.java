package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.models.User;
import com.xa.crmgena.crm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("welcome")
    public String hello(){
        return "users area";
    }



    @GetMapping
  //  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<User> getAll(){
        return userRepository.findAll();
    }





    @GetMapping("/moderator")
   // @PreAuthorize("hasRole('MODERATOR')")
    public List<User> getAllModerator(){
        return userRepository.findAll();
    }




    @GetMapping("/dashboard")
    //@PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllAdminDashbord(){
        return userRepository.findAll();
    }

}
