package net.techtter.springkafkadocker.springkafkadockerint;

import net.techtter.springkafkadocker.springkafkadockerint.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    MessageService messageService;

    @KafkaListener(topics="my_topic", groupId="my_group_id")
    public void getMessage(String message){

        System.out.println(message);
        messageService.saveMessage(message);

    }
}