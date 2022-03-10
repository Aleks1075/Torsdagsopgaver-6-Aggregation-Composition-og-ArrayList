package com.company;

public class Room
{
    private int Walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int walls, int numberOfDoors, int numberOfLamps, int numberOfWindows)
    {
        this.Walls = walls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getWalls()
    {
        return Walls;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getNumberOfLamps()
    {
        return numberOfLamps;
    }

    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }
}