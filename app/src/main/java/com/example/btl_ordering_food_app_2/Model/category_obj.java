package com.example.btl_ordering_food_app_2.Model;

import java.io.Serializable;

public class category_obj implements Serializable {
    //Attributes
    private int ID;
    private String Name;
    private int Image;
    //Contructor

    public category_obj(int ID, String name, int image) {
        this.ID = ID;
        Name = name;
        Image = image;
    }
    //Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
