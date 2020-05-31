package com.example.istio.authorizationtion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Demo2Api {

    @GetMapping("/demo2")
    public String greeting() {
        return "hello demo 2";
    }

}
