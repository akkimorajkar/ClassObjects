package com.company;

public class Constructor_Example_2 {

    String brand;
    String type;
    int amount;
    String wheelType;
    static int wheels = 4;

    /*Constructor Properties
    1. Same name as Class name
    2. No return Type not even void
    3. can be overloaded
    4. Never returns Value
    5. used to create the template of the specific object
    6. Easy & efficient eay to initialize and object and assign values to it
     */

    public Constructor_Example_2(String brand, String type, int amount) { // constructors can be generated using generate in intellij
        this.brand = brand;  // "this" keyword is used to access the class variables and assining them the value of local variable
        this.type = type;
        this.amount = amount;
    }

    public Constructor_Example_2(String brand, String type, int amount, String wheelType) {
        this.brand = brand;
        this.type = type;
        this.amount = amount;
        this.wheelType = wheelType;
    }

    public Constructor_Example_2(String brand, int amount) {
        this.brand = brand;
        this.amount = amount;
    }

    public static void main (String[] args){

        Constructor_Example_2 const1 = new Constructor_Example_2("BMW" , "Convertible",80);

        System.out.println(const1.brand +" " + const1.type+" " + const1.amount+ " " +const1.wheelType);


        Constructor_Example_2 const2 = new Constructor_Example_2("Audi" , "Sports",80,"4 Wheel Drive");

        System.out.println(const2.brand +" " + const2.type+" " + const2.amount + const2.wheelType);


        Constructor_Example_2 const3 = new Constructor_Example_2("Mercedes" , "Sedan",90,"4 Wheel Drive");

        System.out.println(const2.brand +" " + const2.type+" " + const2.amount +" "+ const2.wheelType);

    }


}
