package com.example.lms.service;

import com.example.lms.entity.Message;
import com.example.lms.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesForReceiver(Long receiverId) {
        return messageRepository.findByReceiverId(receiverId);
    }

    public Message sendMessage(Message message) {
        message.setSentAt(LocalDateTime.now());
        message.setRead(false);
        return messageRepository.save(message);
    }

    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }

    public Message markAsRead(Long id) {
        Optional<Message> msgOpt = messageRepository.findById(id);
        if (msgOpt.isPresent()) {
            Message msg = msgOpt.get();
            msg.setRead(true);
            return messageRepository.save(msg);
        }
        return null;
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
