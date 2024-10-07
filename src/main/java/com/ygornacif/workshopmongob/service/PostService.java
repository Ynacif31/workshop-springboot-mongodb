package com.ygornacif.workshopmongob.service;

import com.ygornacif.workshopmongob.domain.Post;
import com.ygornacif.workshopmongob.domain.User;
import com.ygornacif.workshopmongob.dto.UserDTO;
import com.ygornacif.workshopmongob.exception.ObjectNotFoundException;
import com.ygornacif.workshopmongob.repository.PostRepository;
import com.ygornacif.workshopmongob.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
       return repo.findAll();
    }

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("objeto não encontrado"));
    }


    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }


}
