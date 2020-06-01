package com.example.istio.authorizationtion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class Demo1Api {

    @Qualifier("JAEGER")
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/demo1")
    public String greeting(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });
       // String fooResourceUrl = "http://demo2-service:8081/demo2";
        String fooResourceUrl = "http://localhost:8081/demo2";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return "hello demo 1" + response.getBody();
    }

}
