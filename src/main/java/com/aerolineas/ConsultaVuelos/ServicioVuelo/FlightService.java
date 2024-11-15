package com.aerolineas.ConsultaVuelos.ServicioVuelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class FlightService {

    @Value("${aviation.api.key}")
    private String apiKey="691b3bcd10eed57cd04c10e436038f06";

    private static final String API_URL = "https://api.aviationstack.com/v1/airlines"; // Cambia esta URL según la API que utilices

    public String getFlightSchedule(String airlineCode) {
        System.out.println("API Key: " + apiKey); // Línea para depurar
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                                         .queryParam("access_key", apiKey)
                                         .queryParam("airline_code", airlineCode)
                                         .toUriString();
         
        System.out.println("URL generada: " + url);
        return restTemplate.getForObject(url, String.class);
    }
}
