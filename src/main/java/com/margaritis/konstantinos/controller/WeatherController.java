package com.margaritis.konstantinos.controller;


import com.margaritis.konstantinos.domain.Weather;
import com.margaritis.konstantinos.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;


    @GetMapping("/list")
    public Iterable<Weather> lsit() {
        return weatherService.findAll();
    }


}
