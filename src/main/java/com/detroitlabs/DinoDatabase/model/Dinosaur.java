package com.detroitlabs.DinoDatabase.model;

public class Dinosaur {
    private String dinoName;
    private String pronunciation;
    private String dietType;
    private String era;
    private int imageId;


    public Dinosaur(String dinoName, String pronunciation, String dietType, String era, int imageId) {
        this.dinoName = dinoName;
        this.pronunciation = pronunciation;
        this.dietType = dietType;
        this.era = era;
        this.imageId = imageId;
    }

    public String getDinoName() {
        return dinoName;
    }

    public void setDinoName(String dinoName) {
        this.dinoName = dinoName;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getDietType() {
        return dietType;
    }

    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
