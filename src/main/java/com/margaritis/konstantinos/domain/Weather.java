package com.margaritis.konstantinos.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Weather {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    private String maxhumidity;

    private String maxtempm;

    private String mintempm;

    private String precipm;

    private String response;


    public Weather () {}



}
