package org.example.resource_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public access";
    }

    @GetMapping("/secure")
    public String secureApi() {
        return "Secure access - valid JWT required!";
    }
}
