package com.example.qa3atq8;

public class user {

    private int img;
    private String text;
    private String description;

    public user() {
    }

    public user(int img, String text, String description) {
        this.img = img;
        this.text = text;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
