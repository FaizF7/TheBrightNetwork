package com.bnta.the_bright_network.controllers;

import com.bnta.the_bright_network.models.Message;
import com.bnta.the_bright_network.models.MessageDTO;
import com.bnta.the_bright_network.models.MessageReplyDTO;
import com.bnta.the_bright_network.repositories.MessageRepository;
import com.bnta.the_bright_network.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MessageService messageService;

    @PatchMapping(value = "/{id}")
    public ResponseEntity<MessageReplyDTO> updateMessage(@RequestBody MessageDTO messageDTO, @PathVariable long id) {
        try{
        MessageReplyDTO updatedMessage = messageService.updateMessage(messageDTO, id);
        return new ResponseEntity<>(updatedMessage, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    //Display all messages
    @GetMapping
    public ResponseEntity<List<MessageReplyDTO>> getAllMessage(@RequestParam Optional<String> keyword){
        if(keyword.isPresent()){
            return null;
        }
        List<MessageReplyDTO> allMessages = messageService.getAllMessages();
        return new ResponseEntity<>(allMessages, HttpStatus.OK);
    }

} //Last curly bracket
