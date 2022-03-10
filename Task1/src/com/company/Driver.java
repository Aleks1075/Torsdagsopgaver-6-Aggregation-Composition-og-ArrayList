package com.company;

public class Driver
{
    private String Name;
    private int Age;

    // 1.b Create a constructor that populates all the fields above.
    public Driver(String name,int Age)
    {
        this.Name = name;
        this.Age = Age;
    }


    // 1.g override the toString method in the Driver class, returning: " is driven by "+name
    @Override
    public String toString(){
        return "Is driven by "+ Name +" "+ Age;

    }

}
