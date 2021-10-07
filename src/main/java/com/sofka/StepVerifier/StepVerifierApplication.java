package com.sofka.StepVerifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StepVerifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(StepVerifierApplication.class, args);

		Servicio servicio =  new Servicio();
		servicio.buscarTodosFiltro();
	}

}
