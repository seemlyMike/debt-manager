package com.seemlymike.debtmanager.controller;

import com.seemlymike.debtmanager.domain.Debt;
import com.seemlymike.debtmanager.domain.User;
import com.seemlymike.debtmanager.repository.DebtRepository;
import com.seemlymike.debtmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Component
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DebtRepository debtRepository;

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        User newUser = userRepository.save(user);
        debtRepository.save(new Debt(new BigDecimal(0), newUser));
        return newUser;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public User get(@PathVariable String userId) {
        return userRepository.findOne(userId);
    }
}
