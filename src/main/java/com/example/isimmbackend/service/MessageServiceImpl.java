package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Message;
import com.example.isimmbackend.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(Long id) {
        return messageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found with id: " + id));
    }

    @Override
    public List<Message> findByEtudiantId(Long id) {
        return messageRepository.findByEtudiantId(id);

    }
}
