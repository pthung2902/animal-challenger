package com.stel.challenger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stel.challenger.model.Bird;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/fish")
    public String fish() {
    	Bird bird = new Bird();
    	bird.say();
        return "success";
    }
    
}
