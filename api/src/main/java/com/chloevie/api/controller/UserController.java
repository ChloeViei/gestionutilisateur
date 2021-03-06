package com.chloevie.api.controller;

import com.chloevie.api.model.User;
import com.chloevie.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    /**
    * Read - Get all users
    * @return - An Iterable object of User full filled
    */
    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }
}
