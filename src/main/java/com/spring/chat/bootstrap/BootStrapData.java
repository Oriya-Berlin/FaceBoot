package com.spring.chat.bootstrap;

import com.spring.chat.model.Message;
import com.spring.chat.model.User;
import com.spring.chat.repositories.MessageRepository;
import com.spring.chat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserRepository userRepository;

    public BootStrapData(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {



//        User newUser = new User();
//        newUser.setEmail("j54747asdgda7hd@gmail.com");
//        newUser.setPassword("ravi2020");
//        newUser.setFirstName("jj");
//        newUser.setLastName("hh");
//        User savedUser = userRepository.save(newUser);
//        Date date = new Date();


//        Message msg = new Message(savedUser,2,date,"hello 1111");
//        msg.setSender(savedUser);
//        msg.setReceiver(2L);
//        msg.setDate(date);
//        msg.setContent("hello there222");

//        System.out.println(newUser.toString());
//        System.out.println(msg);
//
//        savedUser.getMessages().add(msg);
//        userRepository.save(newUser);
//        messageRepository.save(msg);


    }
}
