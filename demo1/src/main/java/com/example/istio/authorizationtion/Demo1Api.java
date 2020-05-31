package com.example.istio.authorizationtion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Demo1Api {

    private String url;

    @GetMapping("/demo1")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://demo2-service:8081/demo2";

       // String fooResourceUrl = "http://localhost:8081/demo2";

        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return "hello demo 1" + response.getBody();
    }

}
