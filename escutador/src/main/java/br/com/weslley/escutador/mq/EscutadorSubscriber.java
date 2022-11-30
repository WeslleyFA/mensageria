package br.com.weslley.escutador.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EscutadorSubscriber {
	
	@RabbitListener(queues = "${mq.queues.mensagens}")
	public void recebeMensagemMq(@Payload String payload) {
		System.out.println(payload);
	}
}
