package com.example.ms2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    RestTemplate restTemplate=new RestTemplate();
    @GetMapping("/{city}")
    public ResponseEntity<String> getWeather(@PathVariable String city){
        return restTemplate.getForEntity("https://freetestapi.com/api/v1/weathers?search="+city,String.class);
    }
}
