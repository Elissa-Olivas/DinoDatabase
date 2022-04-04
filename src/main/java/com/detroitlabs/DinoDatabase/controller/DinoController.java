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
    @RequestMapping("/dinosaur/")
    public String allDinos(ModelMap modelMap) {
        List<Dinosaur> dinosaur = dinoRepository.getAllDinos();
//        List<Image> image = imageRepository.getALL_Images();
        modelMap.put("dinosaur", dinosaur);
//        modelMap.put("image", image);
        return "dinosaur";
    }


    //Search Results
    @RequestMapping("/dinosaur/{dinoName}")
    public String dinoByName(@PathVariable String dinoName, ModelMap modelMap) {
        List<Dinosaur> dinoDetails = dinoRepository.returnName(dinoName);
        modelMap.put("dinosaur", dinoDetails);
        return "dinosaur-details";
    }


    @RequestMapping("/fossils")
    public String displayFossilDetails() {
        return "fossils";
    }


}
