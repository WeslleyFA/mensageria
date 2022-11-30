package br.com.weslley.publicador.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    @Value("${mq.queues.mensagens}")
    private String filaMensagens;

    @Bean
    public Queue queueMensagens(){
        return new Queue(filaMensagens, true);
    }
}