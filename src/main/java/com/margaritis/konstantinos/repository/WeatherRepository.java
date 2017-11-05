package com.margaritis.konstantinos.repository;

import com.margaritis.konstantinos.domain.Weather;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WeatherRepository extends CrudRepository<Weather, Long> {


    List<Weather> findAll();


}
