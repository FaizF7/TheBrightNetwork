package com.bnta.the_bright_network.models;

import java.time.LocalDateTime;

public class MessageReplyDTO {
    private long message_id;
    private String username;
    private String messageContent;
    private String timeStamp;

    public MessageReplyDTO(long message_id, String username, String messageContent, String timeStamp) {
        this.message_id = message_id;
        this.username = username;
        this.messageContent = messageContent;
        this.timeStamp = timeStamp;
    }

    public MessageReplyDTO() {
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
