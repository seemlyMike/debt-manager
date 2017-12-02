package com.seemlymike.debtmanager.repository;

import com.seemlymike.debtmanager.domain.Debt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DebtRepository extends MongoRepository<Debt, String> {

}
