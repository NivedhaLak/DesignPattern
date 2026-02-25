package com.design.pattern.Creational.Builder;

public class HouseDirector {
    HouseBuilder houseBuilder;

    HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    House constructHome(){
        houseBuilder.getRooms(3);
        houseBuilder.getWalls(4);
        houseBuilder.hasBalcony(false);
        houseBuilder.hasCeiling(true);
        houseBuilder.hasGarden(true);
        houseBuilder.hasFloor(true);
        return houseBuilder.getHouse();
    }
}
