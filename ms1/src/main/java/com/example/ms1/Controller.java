package com.example.ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    RestTemplate restTemplate=new RestTemplate();
    @GetMapping
    public ResponseEntity<String>getWeather(){
         return restTemplate.getForEntity("https://freetestapi.com/api/v1/destinations",String.class);
    }
    @GetMapping("/{name}")
    public ResponseEntity<String>getWeatherByName(@PathVariable String name){
        return restTemplate.getForEntity("http://localhost:8082/"+name,String.class);
    }
}
