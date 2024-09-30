package com.ygornacif.workshopmongob.service;

import com.ygornacif.workshopmongob.domain.User;
import com.ygornacif.workshopmongob.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
       return repo.findAll();
    }
}
