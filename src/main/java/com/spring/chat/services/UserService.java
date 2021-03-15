package com.spring.chat.services;


import com.spring.chat.model.User;
import com.spring.chat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // get all users
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
