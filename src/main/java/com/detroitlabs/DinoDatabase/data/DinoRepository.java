package com.detroitlabs.DinoDatabase.data;

import com.detroitlabs.DinoDatabase.model.Dinosaur;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DinoRepository {

    private static final List<Dinosaur> ALL_DINOS = Arrays.asList(
            new Dinosaur("Alectrosaurus", "ah-LEK-tro-sore-us", "Carnivore", "Cretaceous", "Alectrosaurus"),
            new Dinosaur("Allosaurus", "AL-oh-saw-russ", "Carnivore", "Jurassic", "Allosaurus"),
            new Dinosaur("Ankylosaurus", "an-KIE-loh-sore-us", "Herbivor", "Cretaceous", "Ankylosaurus"),
            new Dinosaur("Brachiosaurus", "BRAK-ee-oh-sore-us", "Herbivor", "Jurassic", "Brachiosaurus"),
            new Dinosaur("Confuciusornis", "kon-few-shus-or-niss", "Carnivore", "Cretaceous", "Confuciusornis"));


    public static List<Dinosaur> getAllDinos() {
        return ALL_DINOS;
    }

    public List<Dinosaur> returnImageId(String imageId) {
        List<Dinosaur> imageNameSearch = new ArrayList<>();
        for (Dinosaur dinosaur : ALL_DINOS) {
            if (dinosaur.getImageId().equals(imageId)) {
                imageNameSearch.add(dinosaur);
            }
        }
        return imageNameSearch;
    }



    public List<Dinosaur> returnName(String dinoName) {
        List<Dinosaur> nameOfDino = new ArrayList<>();
        for (Dinosaur dinosaur : ALL_DINOS) {
            if (dinosaur.getDinoName().equals(dinoName)) {
                nameOfDino.add(dinosaur);
            }
        }
        return nameOfDino;
    }

//ADDING IN A CATEGORY for ID- id == eraID
    public List<Dinosaur> findByEraID(String eraName) {
        List<Dinosaur> dinosByCategory = new ArrayList<>();
        for (Dinosaur dinosaur : ALL_DINOS) {
            if (dinosaur.getEraName().equals(eraName)) {
                dinosByCategory.add(dinosaur);
            }
        }
        return dinosByCategory;
    }


    //ADDING IN A CATEGORY for ID- id == eraID
    public List<Dinosaur> findByDietID(String dietName) {
        List<Dinosaur> dinosByCategory = new ArrayList<>();
        for (Dinosaur dinosaur : ALL_DINOS) {
            if (dinosaur.getDietName().equals(dietName)) {
                dinosByCategory.add(dinosaur);
            }
        }
        return dinosByCategory;
    }

    //    METHOD TO RETURN ALL GIFS WHOS NAME CONTAINS A SPECIFIED STRING
    //searches for a specific dino by name
    public List<Dinosaur> searchResults(String dinoName) {
        List<Dinosaur> searchDinoByName = new ArrayList<>();
        for (Dinosaur dinosaur : ALL_DINOS) {
            if (dinosaur.getDinoName().contains(dinoName)) {
                searchDinoByName.add(dinosaur);
            }
        }
        return searchDinoByName;
    }
}
