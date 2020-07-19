package com.example.qa3atq8;

import java.io.Serializable;

public class halls implements Serializable {
    private String name;
    private int rating;
    private int image;
    private String location;
    private String space;

    public halls(String name, int rating, int image, String location, String space) {
        this.name = name;
        this.rating = rating;
        this.image = image;
        this.location = location;
        this.space = space;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }
}
