package com.endor.artifact_testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DummyController {

    @GetMapping("/greet")
    public Map<String, String> greet() {
        return Map.of("message", "Hello, World!");
    }
}
