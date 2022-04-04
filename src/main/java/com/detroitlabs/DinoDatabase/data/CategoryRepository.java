package com.detroitlabs.DinoDatabase.data;

import com.detroitlabs.DinoDatabase.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> DIET_CATEGORIES = Arrays.asList(
            new Category(1, "Carnivore"),
            new Category(2, "Herbivor"),
            new Category(3, "Omnivore"));


    public static List<Category> getDietCategories() {
        return DIET_CATEGORIES;
    }

    public List<Category> findDietByID(int id) {
        List<Category> categoryByDiet = new ArrayList<>();
        for (Category category : DIET_CATEGORIES) {
            if (category.getId() == id) {
                categoryByDiet.add(category);
            }
        }
        return categoryByDiet;
    }



    private static final List<Category> ERA_CATEGORIES = Arrays.asList(
            new Category(4, "Late Cretaceous"),
            new Category(5, "Late Jurassic"));


    public static List<Category> getEraCategories() {
        return ERA_CATEGORIES;
    }



    public List<Category> findEraByID(int id) {
        List<Category> categoryByEra = new ArrayList<>();
        for (Category category : ERA_CATEGORIES) {
            if (category.getId() == id) {
                categoryByEra.add(category);
            }
        }
        return categoryByEra;
    }
}

