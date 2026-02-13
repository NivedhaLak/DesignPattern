package com.design.pattern.Decorator_Pattern;

public class BeveragesVO {
    double cost;
    String description;

    public BeveragesVO(){

    }
    public BeveragesVO(double cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
