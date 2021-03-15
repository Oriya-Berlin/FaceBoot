package com.spring.chat.model;


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
    private Integer id;


    @Column(name = "receiver_id",nullable = false, length = 64)
    private Integer receiver;

    @Column(name = "date", nullable = false, length = 30)
    private Date date;

    @Column(name = "content", nullable = false, length = 64)
    private String content;


    public Message(){
    }

    public Message( Integer receiver, Date date, String content) {
        super();
        this.receiver = receiver;
        this.date = date;
        this.content = content;
    }


    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
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
                ", receiver=" + receiver +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
