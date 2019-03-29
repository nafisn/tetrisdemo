package com.tetris.demo.controller;

import com.tetris.demo.entity.User;
import com.tetris.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping( value = "/user/create")
    public User createUser(@RequestBody Map<String, String> userRequest){
        return this.userService.createUser(userRequest);
    }

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username){
        return this.userService.getUser(username);
    }


}
