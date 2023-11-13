package com.bnta.the_bright_network.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chat_rooms")
public class ChatRoom {

    //Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    private List<Subscription> subscriptions;

    private List<Message> messages;

    //Constructors
    public ChatRoom(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    //Default constructor
    public ChatRoom() {
    }


    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

} //Last curly bracket
