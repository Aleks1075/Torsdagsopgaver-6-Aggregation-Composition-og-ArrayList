package com.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList <Customer> customers = new ArrayList<>();
    public static void main(String[] args) {

        Customer customer1 = new Customer("Aleks", "Buha", "Abu", 7);
        Customer customer2 = new Customer("Nikolaj", "Bond", "Bo", 5);
        Customer customer3 = new Customer("Pelle", "Hulk", "Hu", 1);
        Customer customer4 = new Customer("Chris", "W", "Ch", 4);
        Customer customer5 = new Customer("Amalie", "Petersen", "Ma", 2);
        Customer customer6 = new Customer("Lærke", "Hansen", "Ol", 6);

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        System.out.println(printCustomers());
    }

    public static String printCustomers()
    {

    for(Customer customer : customers) {
        System.out.println(customer);
    }
        return null;
    }

}

