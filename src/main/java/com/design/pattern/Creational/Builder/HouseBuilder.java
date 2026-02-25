package com.design.pattern.Creational.Builder;

public interface HouseBuilder {
    void getRooms(int rooms);
    void getWalls(int walls);
    void hasFloor(boolean floor);
    void hasBalcony(boolean balcony);
    void hasCeiling(boolean ceiling);
    void hasGarden(boolean garden);

    House getHouse();
}
