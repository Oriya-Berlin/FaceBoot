package com.spring.chat.services;


import com.spring.chat.models.Message;
import com.spring.chat.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Optional<Message> findMsgByUserId(Long id){
        return messageRepository.findById(id);
    }

}
