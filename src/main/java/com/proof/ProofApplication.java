package com.proof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProofApplication {
    @GetMapping("/")
    public String hello() {
        return "proof-spring-boot: one estate, many LXS. just use it.";
    }
    public static void main(String[] args) {
        SpringApplication.run(ProofApplication.class, args);
    }
}
