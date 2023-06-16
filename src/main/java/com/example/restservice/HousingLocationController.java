package com.example.restservice;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HousingLocationController {
    
    // temp
    @CrossOrigin(origins = "*")
    @GetMapping("/locations")
    public String getLocationsJson() throws IOException {
        // ObjectMapper mapper = new ObjectMapper();
        // InputStream is = new ClassPathResource("housing-locations.json").getInputStream();
        // return mapper.readValue(is, HousingLocation.class);

        InputStream is = new ClassPathResource("housing-locations.json").getInputStream();
        byte[] bytes = is.readAllBytes();

        String json = new String(bytes);
        return json;
    }
}