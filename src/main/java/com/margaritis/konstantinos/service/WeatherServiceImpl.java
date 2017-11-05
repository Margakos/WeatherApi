package com.margaritis.konstantinos.service;

import com.margaritis.konstantinos.domain.Weather;
import com.margaritis.konstantinos.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Override
    public List<Weather> findAll() {
        return weatherRepository.findAll();
    }



    @Override
    public void register(Weather weather) throws Exception {
        weatherRepository.save(weather);

    }

}
