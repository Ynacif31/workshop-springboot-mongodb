package com.ygornacif.workshopmongob.resources;

import com.ygornacif.workshopmongob.domain.Post;
import com.ygornacif.workshopmongob.domain.User;
import com.ygornacif.workshopmongob.dto.UserDTO;
import com.ygornacif.workshopmongob.service.PostService;
import com.ygornacif.workshopmongob.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping
    private ResponseEntity<List<Post>> findAll() {
        List<Post> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
