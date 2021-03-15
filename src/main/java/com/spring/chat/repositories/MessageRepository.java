package com.spring.chat.repositories;

import com.spring.chat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

//    @Query("SELECT u FROM Message u WHERE u.sender_id = ?1")
//    public Optional<Message> findBySender(Integer id);

}
