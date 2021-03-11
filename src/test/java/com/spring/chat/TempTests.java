package com.spring.chat;

import static org.assertj.core.api.Assertions.assertThat;

import com.spring.chat.models.Message;
import com.spring.chat.models.User;
import com.spring.chat.repositories.MessageRepository;
import com.spring.chat.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

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


//    @Test
//    public void testUser(){
//
//        User newUser = new User();
//        newUser.setEmail("bamba@gmail.com");
//        newUser.setPassword("ravi2020");
//        newUser.setFirstName("kola");
//        newUser.setLastName("limon");
//
//        User savedUser = userRepository.save(newUser);
//
//        //User existUser = entityManager.find(User.class, savedUser.getId());
//
//        //assertThat(newUser.getEmail()).isEqualTo(existUser.getEmail());
//    }


    @Test
    public void testMsg(){

        Optional<User> newUser1 = userRepository.findById(1L);
        User user1 = newUser1.get();
        System.out.println(user1.toString());

        Optional<User> newUser2 = userRepository.findById(2L);
        User user2 = newUser2.get();
        System.out.println(user2.toString());


        Date date = new Date();

        Message msg = new Message(user1, 2L,date,"hello there3");

        messageRepository.save(msg);

    }

    @Test
    public void testMsg2(){

        List<Message> messages =  messageRepository.findAll();
        for(Message msg: messages)
            System.out.println(msg);
    }



}
