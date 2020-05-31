package com.example.istio.authorizationtion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Demo1Api {

    @GetMapping("/demo1")
    public String greeting() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://demo2-service:8081/demo2";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return "hello demo 1" + response.getBody();
    }

}
