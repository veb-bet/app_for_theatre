package com.example.application_of_theatre.Model;

public class Events {
    private String name, places, count;

    public Events(){

    }

    public Events(String name, String places, String count) {
        this.name = name;
        this.places = places;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
