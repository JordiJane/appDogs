package com.example.jordi.recyclerviewactionview;

/**
 * Created by Jordi on 24/07/2017.
 */

public class Animal {

    private int photo;
    private String name;
    private String ranking;

    public Animal(int photo, String name, String ranking) {
        this.photo = photo;
        this.name = name;
        this.ranking = ranking;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
