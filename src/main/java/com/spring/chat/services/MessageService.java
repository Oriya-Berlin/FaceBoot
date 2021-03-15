package com.spring.chat.services;


import com.spring.chat.model.Message;
import com.spring.chat.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Optional<Message> findMsgByUserId(Integer id){
        return messageRepository.findById(id);
    }

//    public List<> getList() {
//        List<Message> values = new ArrayList<>();
//        if (value == null) {
//            throw new NoSuchElementException("No value present");
//        }
//        return value;
//    }

}
