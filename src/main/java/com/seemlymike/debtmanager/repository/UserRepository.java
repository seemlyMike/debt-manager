package com.seemlymike.debtmanager.repository;

import com.seemlymike.debtmanager.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
