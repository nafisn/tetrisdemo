package com.tetris.demo.service;

import com.tetris.demo.entity.User;
import com.tetris.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(Map<String,String> userRequest){
        String username = userRequest.get("username");
        String email = userRequest.get("email");
        String password = userRequest.get("password");
        String highScore = userRequest.get("highScore");

        User newUser = new User();

        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setHighScore(Integer.parseInt(highScore));

        return userRepository.save(newUser);
    }

    public User getUser(String username){
        return this.userRepository.findUserByUsername(username);
    }

}
