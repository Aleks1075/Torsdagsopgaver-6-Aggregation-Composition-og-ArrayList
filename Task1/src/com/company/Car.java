package com.company;

public class Car
{
    private String Make;
    private String Model;
    private  int Year;
    private String BodyStyle;
    private String Driver;

    // 1.d Create a constructor, that populates all the fields above, except the Driver.
    public Car(String Make, String Model , int Year, String BodyStyle)
    {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.BodyStyle = BodyStyle;
    }
    // 1.e Create a Getter and a Setter for the Driver variable.
    public String getDriver()
    {
        return Driver;
    }
    public void setDriver(String newDriver)
    {
        this.Driver = newDriver;
    }

    // 1.f override the toString method in the Car class, returning:"Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle
    @Override
    public String toString(){
        return " Make: "+ Make + "\n Model: " + Model + " \n Year: " +Year+ "\n BodyStyle: " +BodyStyle;

    }

}
