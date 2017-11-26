package com.seemlymike.debtmanager.controller;

import com.seemlymike.debtmanager.model.User;
import com.seemlymike.debtmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public User get(@PathVariable String userId) {
        return userRepository.findOne(userId);
    }
}
