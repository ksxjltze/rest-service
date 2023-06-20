package com.example.restservice;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.HousingLocation;

@RestController
public class HousingLocationController {
    
    // temp
    @CrossOrigin(origins = "*")
    @GetMapping("/locations")
    public List<HousingLocation> getLocationsJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = new ClassPathResource("housing-locations.json").getInputStream();
        return mapper.readValue(is, new TypeReference<List<HousingLocation>>(){});
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/locations/{id}")
    public HousingLocation getHousingLocation(@PathVariable int id) throws IOException {
        return getLocationsJson().get(id);
    }
}