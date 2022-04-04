package com.detroitlabs.DinoDatabase.data;

import com.detroitlabs.DinoDatabase.model.Category;
import com.detroitlabs.DinoDatabase.model.Dinosaur;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DinoRepositoryTest {

    @Test     //PASS
    void getAllDinos() {
        DinoRepository dinoRepository = new DinoRepository();
        for (Dinosaur dinosaur : dinoRepository.getAllDinos()) {
            System.out.println(dinosaur.getDinoName());
        }
    }

    @Test     //PASS
    void returnImageId() {
        DinoRepository dinoRepository = new DinoRepository();
        List<Dinosaur> results= dinoRepository.returnImageId("Brachiosaurus");
        for (Dinosaur dinosaur : results) {
            assertTrue(dinosaur.getImageId().equals("Brachiosaurus"));
        }
    }

    @Test    //PASS
    void returnName() {
        DinoRepository dinoRepository = new DinoRepository();
        List<Dinosaur> results= dinoRepository.returnName("Ankylosaurus");
        for (Dinosaur dinosaur : results) {
            assertTrue(dinosaur.getDinoName().equals("Ankylosaurus"));
        }
    }

    @Test //PASS
    void searchResults() {
        DinoRepository dinoRepository = new DinoRepository();
        List<Dinosaur> results = dinoRepository.searchResults("Ankylosaurus");
        for (Dinosaur dinosaur : results) {
            assertTrue(dinosaur.getDinoName().equals("Ankylosaurus"));
        }
    }

    @Test     //Pass
    void findByEraID() {
        DinoRepository dinoRepository = new DinoRepository();
        List<Dinosaur> results= dinoRepository.findByEraID("Cretaceous");
        for (Dinosaur dinosaur : results) {
            assertTrue(dinosaur.getEraName().equals("Cretaceous"));
        }

    }

    @Test      //Pass
    void findByDietID() {
        DinoRepository dinoRepository = new DinoRepository();
        List<Dinosaur> results= dinoRepository.findByDietID("Carnivore");
        for (Dinosaur dinosaur : results) {
            assertTrue(dinosaur.getDietName().equals("Carnivore"));
        }
    }
}