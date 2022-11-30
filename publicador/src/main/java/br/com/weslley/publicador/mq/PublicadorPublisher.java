package br.com.weslley.publicador.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class PublicadorPublisher {

	private final Queue queueMensagens;
	private final RabbitTemplate rabbitTemplate;

	public PublicadorPublisher(Queue queueEmissaoCartoes, RabbitTemplate rabbitTemplate) {
		this.queueMensagens = queueEmissaoCartoes;
		this.rabbitTemplate = rabbitTemplate;
	}

	public void publicaMensagem(String mensagem) {
		rabbitTemplate.convertAndSend(queueMensagens.getName(), mensagem);
	}

}
