package com.detroitlabs.DinoDatabase.data;

import com.detroitlabs.DinoDatabase.model.Dinosaur;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DinoRepository {

    private static final List<Dinosaur> ALL_DINOS = Arrays.asList(
            new Dinosaur("Alectrosaurus", "ah-LEK-tro-sore-us", "Carnivore", "Late Cretaceous", "Dino1")
}
