package com.seemlymike.debtmanager.controller;

import com.seemlymike.debtmanager.domain.Debt;
import com.seemlymike.debtmanager.repository.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value = "/debts")
public class DebtController {

    @Autowired
    private DebtRepository debtRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/{debtId}")
    public Debt get(@PathVariable String debtId) {
        return debtRepository.findOne(debtId);
    }

}
