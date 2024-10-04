package com.ygornacif.workshopmongob.service;

import com.ygornacif.workshopmongob.domain.User;
import com.ygornacif.workshopmongob.exception.ObjectNotFoundException;
import com.ygornacif.workshopmongob.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
       return repo.findAll();
    }

    public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado"));
    }
}
