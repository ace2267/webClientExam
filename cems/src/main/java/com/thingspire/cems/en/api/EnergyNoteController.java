package com.thingspire.cems.en.api;

import com.thingspire.cems.en.service.EnergyNoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("/api/en")
public class EnergyNoteController {

    @Autowired
    EnergyNoteService energyNoteService;


    @GetMapping("/getTestData")
    public void listGithubRepositories() {
         energyNoteService.testGet();
    }
}
