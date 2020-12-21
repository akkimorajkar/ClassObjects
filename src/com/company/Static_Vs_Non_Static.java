package com.company;

import com.sun.jmx.mbeanserver.NamedObject;

public class Static_Vs_Non_Static {

    String name;
    int amount;
    static int total;

    public void getName(){

        System.out.println("get Name");
    }

    public static void sayName (){


        System.out.println("SayName");
    }

    public static void main(String[] args){

        // Static data members (variables & methods) are stored in Common memory allocation
        // Static members do not require Object to call them
        // We can also Call Static members directly

        sayName(); // Static method called directly
        Static_Vs_Non_Static non_stat = new Static_Vs_Non_Static();

        non_stat.getName(); // Non_Stat method called by ref Object

        Static_Vs_Non_Static.sayName(); // static method called by ClassName

        total = 10; // static member directly referenced

        non_stat.amount = 20; // non stat member called by Reference of the Object



    }

}
