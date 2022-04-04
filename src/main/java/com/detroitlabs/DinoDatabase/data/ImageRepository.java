package com.detroitlabs.DinoDatabase.data;


import com.detroitlabs.DinoDatabase.model.Dinosaur;
import com.detroitlabs.DinoDatabase.model.Image;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {


    private static final List<Image> ALL_Images = Arrays.asList(
            new Image("Alectrosaurus", "Alectrosaurus"),
            new Image("Allosaurus", "Allosaurus"),
            new Image("Ankylosaurus", "Ankylosaurus"),
            new Image("Brachiosaurus", "Brachiosaurus"),
            new Image("Confuciusornis", "Confuciusornis"));


    public static List<Image> getALL_Images() {
        return ALL_Images;
    }


    //find by name
    public Image setPic(String imageId) {
        for (Image image: ALL_Images) {
            if (image.getImageId().equals(imageId)) {
                return image;
            }
        }
        return null;
    }

    public Image setPicName(String imageName) {
        for (Image image: ALL_Images) {
            if (image.getImageName().equals(imageName)) {
                return image;
            }
        }
        return null;
    }

    public Image getImageName(String imageName) {
        for (Image image: ALL_Images) {
            if(image.getImageName().equals(imageName)) {
                return image;
            }
        }
        return null;
    }

    public List<Image> returnImageName(String imageName) {
        List<Image> imageNameSearch = new ArrayList<>();
        for (Image image : ALL_Images) {
            if (image.getImageName().equals(imageName)) {
                imageNameSearch.add(image);
            }
        }
        return imageNameSearch;
    }
}
