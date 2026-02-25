package com.design.pattern.Creational.Builder;

public class BuilderPattern {
    public static void main(String[] args) {
        HouseBuilder builder = new SimpleHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(builder);
        houseDirector.constructHome().show();
    }
}
