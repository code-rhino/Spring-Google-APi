package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


    @Override
    public void run(String... args) throws Exception {
        //
        String key = "";
        String location = "Popeyes";
        String lat = "39.674768";
        String lon = "-75.6592079";
        String radius = "50";
        String url = String.format("https://maps.googleapis.com/maps/api/place/autocomplete/json?key=%s&input=%s&location=%s,%s&radius=%s", key, location, lat, lon, radius);
        ResponseEntity<PredictionsResponse> response = restTemplate.getForEntity(url,PredictionsResponse.class);
        Prediction[] data = response.getBody().getPredictions();
        for(Prediction prediction :data)
            logger.info(prediction.toString());
    }
}
