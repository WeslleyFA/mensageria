package br.com.weslley.publicador.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import br.com.weslley.publicador.mq.PublicadorPublisher;
import br.com.weslley.publicador.service.MensagemService;

@Service
public class Program {
	@Autowired
	private MensagemService service;
	@Autowired
	private PublicadorPublisher publisher;

	@Bean
	public void programRun() {
		while (true) {
			try {
				Thread.sleep(5000);
				String mensagem = service.getMensagem();
				publisher.publicaMensagem(mensagem);
			} catch (InterruptedException e) {
			}
		}

	}

}
