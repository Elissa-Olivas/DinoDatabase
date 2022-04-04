package com.detroitlabs.DinoDatabase.data;


import com.detroitlabs.DinoDatabase.model.Image;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {


    private static final List<Image> ALL_Images = Arrays.asList(
            new Image("nameOfDino", "dino1"),
            new Image("nameOfDino", "Dino2"),
            new Image("nameOfDino", "Dino3"),
            new Image("nameOfDino", "Dino4"),
            new Image("nameOfDino", "Dino5"),
            new Image("nameOfDino", "Dino6"));


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
}
