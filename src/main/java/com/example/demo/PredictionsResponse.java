package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class PredictionsResponse {
    private Prediction[] predictions;

    public Prediction[] getPredictions() {
        return predictions;
    }

    public void setPredictions(Prediction[] predictions) {
        this.predictions = predictions;
    }
}
