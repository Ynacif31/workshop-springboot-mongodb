package com.ygornacif.workshopmongob.repository;

import com.ygornacif.workshopmongob.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
