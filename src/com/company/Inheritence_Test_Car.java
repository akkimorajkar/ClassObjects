package com.company;

public class Inheritence_Test_Car {


    public static void main (String[] args){


        Inheritance_Child_BMW bmw = new Inheritance_Child_BMW();

        bmw.autoStart(); // When Parent Class Overridden Method is called via a referrence of Child Class, chilsClass method is executed
        bmw.autoDoorLock();
        bmw.autoAirBags();
        bmw.autoParking();


        Inheritence_Parent_Car car = new Inheritence_Parent_Car();

        car.autoStart(); //Reference of Car Class Object Cannot access the methods of the Child Class that has inheritted him
        car.autoAirBags();
        car.autoDoorLock();

        Inheritence_Parent_Car car2 = new Inheritance_Child_BMW();

        // Creating Child Class Object & then Calling methods from it using Part Class Ref Variable
        // This is called Top Casting

        car2.autoStart();
        car2.autoAirBags();
        car2.autoDoorLock();

        //car2.autoparking(); This method cannot be called which is unique to Child Class & not present in Parent Class
        // This is Call Referrence Type Check

        //Inheritance_Child_BMW bmw2 = new Inheritence_Test_Car();

    }


}
