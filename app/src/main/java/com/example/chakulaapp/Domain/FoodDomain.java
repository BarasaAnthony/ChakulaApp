package com.example.chakulaapp.Domain;

import java.io.Serializable;

public class FoodDomain implements Serializable {
    private  String title;
    private String pic;
     private String description;
    private Double fees;
     private int numberInCat;

    public FoodDomain(String title, String pic, Double fees, String description) {
        this.title = title;
        this.pic = pic;
        this.fees = fees;
        this.description = description;
    }

    public FoodDomain(String title, String pic, Double fees, String description, int numberInCat) {
        this.title = title;
        this.pic = pic;
        this.fees = fees;
        this.description = description;
        this.numberInCat = numberInCat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberInCat() {
        return numberInCat;
    }

    public void setNumberInCat(int numberInCat) {
        this.numberInCat = numberInCat;
    }
}
