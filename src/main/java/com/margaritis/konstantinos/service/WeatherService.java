package com.margaritis.konstantinos.service;

import com.margaritis.konstantinos.domain.Weather;

import java.util.List;

public interface WeatherService {

    List<Weather> findAll();

    void register(Weather weather) throws Exception;

}
