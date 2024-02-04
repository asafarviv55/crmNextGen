package com.xa.crmgena.crm.controllers;


import com.xa.crmgena.crm.dtos.UserDTO;

import com.xa.crmgena.crm.models.Option;
import com.xa.crmgena.crm.models.User;
import com.xa.crmgena.crm.repositories.UserRepository;
import com.xa.crmgena.crm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    UserRepository userRepository;


    @Autowired
    UserService userService;




    @GetMapping("/welcome")
    public String hello(){
        logger.info(" UserController.hello   ");

        return "users area";
    }


    @GetMapping("/options")
    public List<Option> getAllOptions() {
        logger.info(" UserController.getAllOptions ");

        return userRepository.getAllOptions();

    }

    @PostMapping
    public User createUser(@RequestBody UserDTO userDTO) {
        logger.info(" UserController.createUser   ");
        User user = new User();
        userService.convertUserDTO(userDTO, user);
        return userRepository.save(user);

    }



    @GetMapping("/")
    public List<User> getAllUsers(){
        logger.info(" UserController.getAllUsers ");

        return userRepository.findAll();
    }




    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        logger.info(" UserController.getUserById ");

        Optional<User> user = userRepository.findById(id);

        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }





    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        logger.info(" UserController.updateUser ");

        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            updatedUser.setId(id);
            userRepository.save(updatedUser);
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        logger.info(" UserController.deleteUser ");

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
