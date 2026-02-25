package com.design.pattern.Creational.Builder;

public class House {
    int rooms;
    int walls;
    boolean floor;
    boolean balcony;
    boolean ceiling;
    boolean garden;

    House(){}

    public int getRooms() {
        return rooms;
    }

    public int getWalls() {
        return walls;
    }

    public boolean isFloor() {
        return floor;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public boolean isCeiling() {
        return ceiling;
    }

    public boolean isGarden() {
        return garden;
    }

    void show(){
        System.out.println("House with walls:"+this.getWalls() +" ,floors:"+this.isFloor()+" ,Rooms:"+getRooms()
        +" ,balcony: "+isBalcony()+" ,ceiling: "+isCeiling()+" ,garden: "+isGarden());
    }
}
