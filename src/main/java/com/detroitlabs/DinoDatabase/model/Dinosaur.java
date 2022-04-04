package com.detroitlabs.DinoDatabase.model;

public class Dinosaur {
    private String dinoName;
    private String pronunciation;
    private int dietId;
    private int eraId;
    private String imageId;


    public Dinosaur(String dinoName, String pronunciation, int dietId, int eraId, String imageId) {
        this.dinoName = dinoName;
        this.pronunciation = pronunciation;
        this.dietId = dietId;
        this.eraId = eraId;
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

    public int getDietId() {
        return dietId;
    }

    public void setDietId(int dietId) {
        this.dietId = dietId;
    }

    public int getEraId() {
        return eraId;
    }

    public void setEraId(int eraId) {
        this.eraId = eraId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
