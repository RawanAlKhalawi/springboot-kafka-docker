package net.techtter.springkafkadocker.springkafkadockerint.service;

import net.techtter.springkafkadocker.springkafkadockerint.model.Message;
import net.techtter.springkafkadocker.springkafkadockerint.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public void saveMessage(String message){
        messageRepository.save(new Message(message));
    }
}
