package com.example.restservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // This class is a web controller, so Spring MVC can process incoming requests
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/locations")
    public String getHousingLocations() throws IOException {
        Resource resource = new ClassPathResource("static/housing-locations.json");
        InputStream inputStream = resource.getInputStream();

        byte[] bytes = inputStream.readAllBytes();
        String json = new String(bytes);

        return json;
    }

}
