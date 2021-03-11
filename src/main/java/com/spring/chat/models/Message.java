package com.spring.chat.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false, unique = true, length = 45)
    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User sender;

    @Column(name = "receiver",nullable = false, length = 64)
    private Long receiver;

    @Column(name = "date", nullable = false, length = 20)
    private Date date;

    @Column(name = "content", nullable = false, length = 20)
    private String content;

    public Message(){}

    public Message(User sender, Long receiver, Date date, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
        this.content = content;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
