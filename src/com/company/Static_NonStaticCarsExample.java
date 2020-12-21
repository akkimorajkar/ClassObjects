package com.company;

public class Static_NonStaticCarsExample {

    String BrandName;
    String type;
    int price;
    static int wheels = 4;

    public static void main(String[] args){

        Static_NonStaticCarsExample bmw = new Static_NonStaticCarsExample();

        bmw.BrandName = "BMW";
        bmw.type = "Sports";
        bmw.price = 80;

        System.out.println(bmw.BrandName+" "+ bmw.type+ " "+ bmw.price+ " "+bmw.wheels);

        Static_NonStaticCarsExample audi = new Static_NonStaticCarsExample();

        audi.BrandName = "AUDI";
        audi.type = "Convertible";
        audi.price = 90;

        System.out.println(bmw.BrandName+" "+ bmw.type+ " "+ bmw.price+ " "+bmw.wheels);

        Static_NonStaticCarsExample Honda = new Static_NonStaticCarsExample();

        Honda.BrandName = "Honda";
        Honda.type = "Sedan";
        Honda.price = 30;

        System.out.println(Honda.BrandName+ " "+ Honda.price+ " "+""+Honda.type+" "+Honda.wheels);



    }
}
