package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties
public class Prediction {
    private String description;
    private String place_id;
    private Term[] terms;
    private String[] types;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public Term[] getTerms() {
        return terms;
    }

    public void setTerms(Term[] terms) {
        this.terms = terms;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Prediction{" +
                "description='" + description + '\'' +
                ", place_id='" + place_id + '\'' +
                ", terms=" + Arrays.toString(terms) +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
