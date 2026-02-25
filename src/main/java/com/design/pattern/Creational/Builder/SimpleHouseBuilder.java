package com.design.pattern.Creational.Builder;

public class SimpleHouseBuilder implements HouseBuilder {
    private House house;
    SimpleHouseBuilder(){
        house = new House();
    }

    @Override
    public void getRooms(int rooms) {
        house.rooms = rooms;
    }

    @Override
    public void getWalls(int walls) {
        house.walls = walls;
    }

    @Override
    public void hasFloor(boolean floor) {
        house.floor = floor;
    }

    @Override
    public void hasBalcony(boolean balcony) {
        house.balcony = balcony;
    }

    @Override
    public void hasCeiling(boolean ceiling) {
        house.ceiling = ceiling;
    }

    @Override
    public void hasGarden(boolean garden) {
        house.garden = garden;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
