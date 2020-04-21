package com.odisseia.note.controller;

import com.odisseia.note.domain.User;
import com.odisseia.note.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity save(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity findAll(){
        List<User> userList = userService.findAll();
        return new ResponseEntity(userList, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
