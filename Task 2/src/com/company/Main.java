package com.company;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Room> rooms = new ArrayList<>();
    public static void main(String[] args)
    {
        Room room1 = new Room(4,1,2,3);
        Room room2 = new Room(2,5,3,2);
        Room room3 = new Room(3,9,4,2);

        Building building = new Building(3, 2,4,false);
        System.out.println(room1.getNumberOfLamps() + room2.getNumberOfLamps() + room3.getNumberOfLamps());

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(rooms);

        if (building.getNumberOfFloors() > building.getRooms()){
            System.out.println("this is an odd Building!");
        }

    }
}