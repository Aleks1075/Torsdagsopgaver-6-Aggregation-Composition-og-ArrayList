package com.company;

public class Building
{
    final int Rooms;
    private int numberOfBathrooms;
    private  int numberOfFloors;
    private  boolean isOfficeBuilding;

    public Building(int rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.Rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

    }

    public int getRooms() {
        return Rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}