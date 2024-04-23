package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message getMessageById(Long id);

    List<Message> findByEtudiantId(Long id);
}
