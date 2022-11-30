package br.com.weslley.publicador;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class PublicadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicadorApplication.class, args);
	}

}
