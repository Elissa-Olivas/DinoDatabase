package com.detroitlabs.DinoDatabase.controller;


import com.detroitlabs.DinoDatabase.data.CategoryRepository;
import com.detroitlabs.DinoDatabase.data.DinoRepository;
import com.detroitlabs.DinoDatabase.data.ImageRepository;
import com.detroitlabs.DinoDatabase.model.Dinosaur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DinoController {

    @Autowired
    private DinoRepository dinoRepository;


    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private CategoryRepository categoryRepository;



    //HOME PAGE
    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }


    //List of all dinosaurs
    @RequestMapping("/dinosaurs")
    public String allDinos(ModelMap modelMap) {
        List<Dinosaur> dinosaurs = dinoRepository.getAllDinos();
        modelMap.put("dinosaur", dinosaurs);
        return "dinosaurs";
    }


    //Search Results
    @RequestMapping("/dinosaurs/{dinoName}")
    public String dinoByName(@PathVariable String dinoName, ModelMap modelMap) {
        List<Dinosaur> dinosaurs = dinoRepository.getAllDinos();
        modelMap.put("dinosaur", dinosaurs);
        return "dinosaurs";
    }





}
