package com.thingspire.cems.en.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
public class EnergyNoteService {
    private static final String MIME_TYPE = "application/json";
    private static final String BASE_URL = "https://api.github.com";
    private static final String USER_AGENT = "Spring 5 WebClient";


    private static final WebClient webClient = WebClient.create();

    public void testGet() {
        webClient.post()
                .uri("http://localhost:8080/abc/test")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(response -> {
                    // Handle the response here
                    System.out.println(response);
                });
    }
}
