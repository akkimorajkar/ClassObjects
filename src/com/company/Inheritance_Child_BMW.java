package com.company;

public class Inheritance_Child_BMW extends Inheritence_Parent_Car {


    @Override
    public void autoStart(){

        //This Overriding method from Parent Car Class
        //It has same Name & same Parameters as  well
        //Method Overriding used when u Inherit a class btu then u want to redefine method of that Class

        System.out.println("BMW Quick Start");

    }

    public void autoParking(){

        System.out.println("This BMW hassel free Auto Parking");
    }

}
