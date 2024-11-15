package com.aerolineas.ConsultaVuelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aerolineas.ConsultaVuelos.Interfaz.FlightApp;

import javafx.application.Application;

@SpringBootApplication
public class ConsultaVuelosApplication {

	public static void main(String[] args) {
		        // Iniciar Spring Boot
        SpringApplication.run(ConsultaVuelosApplication.class, args);

        // Iniciar JavaFX en un nuevo hilo
        new Thread(() -> Application.launch(FlightApp.class, args)).start();
	}

}
