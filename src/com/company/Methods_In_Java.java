package com.company;

import java.util.Scanner;

public class Methods_In_Java {

    //class variables
    //class methods  -- > These both are called Class data members
    // We need to create a Object of the Class to call them
    //There cannot be Method inside a method

    public static void main(String[] args) {

        Methods_In_Java obj1 = new Methods_In_Java(); // creating reference & Object of the class

        obj1.test(); // calling method with the help of the reference

        obj1.getTotal(40, 20);

        String name = obj1.getTrainerName();

        System.out.println(name);

        int totalBill = obj1.totalBillAmount();

        System.out.println(totalBill);

        String capi = obj1.capitalName("India");

        if (capi.length() > 1) {

            System.out.println("The Capital of the country is " + capi);

        } else {

            System.out.println("Country Does not exist");
        }

        int studentMarks = obj1.getStudentMarks("Nanu");

        System.out.println(studentMarks);

        boolean browserFlag = obj1.launchDriver("FF");

        if (browserFlag){
            System.out.println("Browser is Successfully Launched");

        }else{

            System.out.println("Browser cannot be launched");
        }

        obj1.driverLaunch("kh");

    }

    // no input & no return mehtod;
    public void test() {

        System.out.println("This is first test method");

    }

    // method with arguments passed to it
    public void getTotal(int number1, int number2) {

        int total = number1 + number2;

        System.out.println("The total = " + total);

    }

    // method with no arguments but return String Type

    public String getTrainerName() {

        System.out.print("The trainer name is ");

        String trainer_name = "Naveen";

        return trainer_name;
    }

    // method with no arguments but return int Type

    public int totalBillAmount() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Total of Food items");

        int bill = sc.nextInt();

        System.out.print("The total bill is ");

        int totalBill = bill + 18;

        return totalBill;


    }

    // method with Arguments & return Type is String

    public String capitalName(String countryName) {

        if (countryName.equalsIgnoreCase("India")) {

            return "New Delhi";
        }

        if (countryName.equalsIgnoreCase("England")) {

            return "London";
        }

        if (countryName.equalsIgnoreCase("USA")) {

            return "Washington DC";
        } else {

            return null;
        }


    }

    // method with arguments & return type is int

    public int getStudentMarks(String studentName) {

        int marks = -1;

        if (studentName.equalsIgnoreCase("Akshay")) {

            marks = 82;

        } else if (studentName.equalsIgnoreCase("Nishad")) {

            marks = 60;
        } else if (studentName.equalsIgnoreCase("Mitesh")) {

            marks = 80;
        } else {

            System.out.println("Student does not exist");

        }

        return marks;


    }

    public boolean launchDriver(String browserName){

        boolean flag = false;

        if (browserName.equalsIgnoreCase("ff")){

            System.out.println("Launch FireFox");
            flag = true;
        }
        else if(browserName.equalsIgnoreCase("Chrome")){

            System.out.println("Chrome");
            flag = true;
        }
        else if (browserName.equalsIgnoreCase("Safari")){

            System.out.println("Safari");
            flag = true;
        }
        else {

            System.out.println("Please Enter the Correct BowserName");

        }

        return flag;


    }

    // Method with Switch case

    public boolean driverLaunch(String nameOfbrowser){

        boolean browserFlag = false;

        switch (nameOfbrowser){

            case "ff": System.out.println("Launching Firefox");
                browserFlag = true;
            break;

            case "Safari" : System.out.println("Launching Safari");
                browserFlag = true;
            break;

            default: System.out.println("Enter Correct Browser Name ");
            break;
        }

        return browserFlag;

    }

}


