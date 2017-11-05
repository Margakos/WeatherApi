package com.margaritis.konstantinos;

import java.io.File;
import java.io.IOException;

import java.net.URL;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.margaritis.konstantinos.domain.Weather;

public class Jackson {


    public void run() {
        ObjectMapper mapper = new ObjectMapper();



        try {

            Weather obj = mapper.readValue(new URL("http://api.wunderground.com/api/85f4020e6f09daba/history_20171030/q/NY/New_York.json"), Weather.class);

            //Convert object to JSON string and save into a file directly
            mapper.writeValue(new File("D:\\weather.json"), obj);

            // Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(obj);
            System.out.println(jsonInString);

            // Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(jsonInString);



            System.out.println(obj);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}