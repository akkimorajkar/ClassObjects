package com.company;

public class Car {

    String brand_name;
    String color;
    int On_road_Price;
    String type;

    public static void main (String[] args){

        Car c1 = new Car(); //Object is RHS & c1 is the reference name
        c1.brand_name="Audi";
        c1.color ="Red";
        c1.On_road_Price= 5800000;
        c1.type = "Sports";

        System.out.println(c1.brand_name + " "+ c1.color+" "+c1.On_road_Price+" "+c1.type);

        Car c2 = new Car(); //Object is RHS & c1 is the reference name
        c1.brand_name="BMW";
        c1.color ="Black";
        c1.On_road_Price= 5000000;
        c1.type = "Sports";

        System.out.println(c1.brand_name + " "+ c1.color+" "+c1.On_road_Price+" "+c1.type);



    }
}
