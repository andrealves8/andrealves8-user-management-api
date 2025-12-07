package com.andrealves.crudspring.controllers;


import com.andrealves.crudspring.entities.User;
import com.andrealves.crudspring.repositories.UserRepository;
import com.andrealves.crudspring.repositories.UserRequest;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid UserRequest userRequest) {
        User user = new User(userRequest);
        userRepository.save(user);
        return ResponseEntity.ok("salvo");
    }

    @GetMapping
    public ResponseEntity listUser() {
        var user = userRepository.findAll();
        return ResponseEntity.ok(user);
    }

    @Transactional
    @PutMapping
    public ResponseEntity updateUser(@RequestBody @Valid UserRequest userRequest) {
        Optional<User> userOptional = userRepository.findById(userRequest.id());

        if(userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(userRequest.name());
            user.setEmail(userRequest.email());
            return ResponseEntity.ok(user);
        }

        return ResponseEntity.ok("Não encontrado");

    }

    @DeleteMapping({"id"})
    public ResponseEntity deleteUser(@PathVariable("id") UUID id) {
        Optional<User> userOptional = userRepository.findById(id);

        if(userOptional.isPresent()) {
            userRepository.deleteById(id);

            return ResponseEntity.ok("Deletado");
        }

        else {

        return ResponseEntity.ok(".");
        }
    }
}
