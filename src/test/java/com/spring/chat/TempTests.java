package com.spring.chat;

import static org.assertj.core.api.Assertions.assertThat;

import com.spring.chat.model.Message;
import com.spring.chat.model.User;
import com.spring.chat.repositories.MessageRepository;
import com.spring.chat.repositories.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class TempTests {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserRepository userRepository;


    @Test
    public void testUser(){

        User newUser1 = new User("bamba@gmail.com","ravi2020","kola","limon");
        User newUser2 = new User("avi@gmail.com","ravi2020","avi","levi");
        User newUser3 = new User("yossi@gmail.com","ravi2020","yossi","cohen");
        User newUser4 = new User("keren@gmail.com","ravi2020","keren","gold");
        User newUser5 = new User("kevin@gmail.com","ravi2020","kevin","roth");
        userRepository.save(newUser1);
        userRepository.save(newUser2);
        userRepository.save(newUser3);
        userRepository.save(newUser4);
        userRepository.save(newUser5);
        //User existUser = entityManager.find(User.class, savedUser.getId());

        //assertThat(newUser.getEmail()).isEqualTo(existUser.getEmail());
    }


    @Test
    public void testMsg(){

        Optional<User> user1 = userRepository.findById(2);
        System.out.println(user1.get().getFirstName());


        Optional<User> user2 = userRepository.findById(4);
        System.out.println(user2.get().getFirstName());


        Date date = new Date();

        // -----------------------------------------------------
        Message msg1 = new Message(4,date,"hello there?");
        user1.get().getMessages().add(msg1);
        userRepository.save(user1.get());

        Message msg2 = new Message(2,date,"how are you?");
        user2.get().getMessages().add(msg2);
        userRepository.save(user2.get());

        Message msg3 = new Message(4,date,"i'm fine, and you?");
        user1.get().getMessages().add(msg3);
        userRepository.save(user1.get());

        Message msg4 = new Message(2,date,"start using spring");
        user2.get().getMessages().add(msg4);
        userRepository.save(user2.get());

        Message msg5 = new Message(4,date,"cool! good luck!");
        user1.get().getMessages().add(msg5);
        userRepository.save(user1.get());

        Message msg6 = new Message(2,date,"thanks!");
        user2.get().getMessages().add(msg6);
        userRepository.save(user2.get());


    }


    @Test
    public void testMsg2(){

        List<Message> messages =  messageRepository.findAll();
        for(Message msg: messages)
            System.out.println(msg);
//
//        Optional<Message> msggs = messageRepository.findById(2);
//        for(Optional msg: msggs)
//            System.out.println(msg);
    }



}
