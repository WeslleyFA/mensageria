package br.com.weslley.escutador;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class EscutadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscutadorApplication.class, args);
	}

}
