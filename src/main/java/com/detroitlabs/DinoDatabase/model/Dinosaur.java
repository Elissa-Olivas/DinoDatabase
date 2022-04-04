package com.detroitlabs.DinoDatabase.model;

public class Dinosaur {
    private String dinoName;
    private String pronunciation;
    private String dietName;
    private String eraName;
    private String imageId;


    public Dinosaur(String dinoName, String pronunciation, String dietName, String eraName, String imageId) {
        this.dinoName = dinoName;
        this.pronunciation = pronunciation;
        this.dietName = dietName;
        this.eraName = eraName;
        this.imageId = imageId;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName;
    }

    public String getEraName() {
        return eraName;
    }

    public void setEraName(String eraName) {
        this.eraName = eraName;
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



    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
