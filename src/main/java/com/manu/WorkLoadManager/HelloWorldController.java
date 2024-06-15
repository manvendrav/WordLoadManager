package com.manu.WorkLoadManager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getMessage() {
        return "Hello Lucky!!!";
    }
}
