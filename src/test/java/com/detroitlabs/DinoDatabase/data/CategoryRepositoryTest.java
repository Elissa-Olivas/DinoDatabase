package com.detroitlabs.DinoDatabase.data;

import com.detroitlabs.DinoDatabase.model.Category;
import com.detroitlabs.DinoDatabase.model.Dinosaur;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoryRepositoryTest {


    @Test   //PASS
    void getDietCategories() {
        CategoryRepository categoryRepository = new CategoryRepository();
        for (Category category : categoryRepository.getDietCategories()) {
            System.out.println(category.getName());
        }

    }

    @Test   //PASS
    void findDietByID() {
        CategoryRepository categoryRepository = new CategoryRepository();
        List<Category> results = categoryRepository.findDietByID(2);
        for (Category category : results) {
            assertTrue(category.getId() == 2);
        }
    }

    @Test   //PASS
    void getEraCategories() {
        CategoryRepository categoryRepository = new CategoryRepository();
        for (Category category : categoryRepository.getEraCategories()) {
            System.out.println(category.getName());
        }
    }

    @Test   //PASS
    void findEraByID() {
        CategoryRepository categoryRepository = new CategoryRepository();
        List<Category> results = categoryRepository.findEraByID(4);
        for (Category category : results) {
            assertTrue(category.getId() == 4);
        }
    }
}