package com.detroitlabs.DinoDatabase.controller;

import com.detroitlabs.DinoDatabase.data.CategoryRepository;
import com.detroitlabs.DinoDatabase.data.DinoRepository;
import com.detroitlabs.DinoDatabase.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {


    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private DinoRepository dinoRepository;

    @RequestMapping("/categories")
    public String displayCategories(ModelMap modelMap) {
        modelMap.put("diet-categories", categoryRepository.getDietCategories());
        modelMap.put("era--categories", categoryRepository.getEraCategories());
        return "categories";
    }


    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap) {
        List<Category> categoryByEra = categoryRepository.findEraByID(id);
        modelMap.put("EraCategory", categoryByEra);
        List<Category> categoryByDiet = categoryRepository.findDietByID(id);
        modelMap.put("DietEra", categoryByDiet);
        return "category";
    }




}
