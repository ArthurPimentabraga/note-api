package com.odisseia.note.service;

import com.odisseia.note.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.odisseia.note.repository.IRepositoryUser;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private IRepositoryUser repository;

    public User save(User user){
        return repository.save(user);
    }

    public List<User> findAll(){
        return repository.findAll();
    }
}
