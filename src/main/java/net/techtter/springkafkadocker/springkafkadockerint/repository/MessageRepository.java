package net.techtter.springkafkadocker.springkafkadockerint.repository;

import net.techtter.springkafkadocker.springkafkadockerint.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MessageRepository extends CrudRepository<Message, Long>{

}
