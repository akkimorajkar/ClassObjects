package com.company;

public class Employee {

    String name;
    String employee_id;
    String dob;
    double Salary;
    boolean isPermanent;

    public static void main (String[] args){

        Employee akki = new Employee();

        akki.name = "Akshay";
        akki.dob = "29/01/1993";
        akki.isPermanent = true;
        akki.Salary = 1000000.00;
        akki.employee_id = "R630460";

        Employee Priya = new Employee();

        Priya.name = "Priyanka";
        Priya.dob = "22/10/1988";
        Priya.isPermanent = true;
        Priya.Salary = 12000000.00;
        Priya.employee_id = "R6304600";


        Employee Raj = new Employee();

        Raj.name = "Raj";
        Raj.dob = "18/01/1982";
        Raj.isPermanent = true;
        Raj.Salary = 1000000.00;
        Raj.employee_id = "R6304600";

            akki = Priya;

         System.out.println(akki.name+" " +akki.dob+" "+akki.isPermanent+" "+akki.Salary+" "+akki.employee_id);

         System.out.println(Priya.name+" " +Priya.dob+" "+akki.isPermanent+" "+Priya.Salary+" "+Priya.employee_id);

         System.out.println(Raj.name+" " +Raj.dob+" "+Raj.isPermanent+" "+Raj.Salary+" "+Raj.employee_id);


        Priya = Raj;

        System.out.println("///////////////////");

        System.out.println(akki.name+" " +akki.dob+" "+akki.isPermanent+" "+akki.Salary+" "+akki.employee_id);

        System.out.println(Priya.name+" " +Priya.dob+" "+akki.isPermanent+" "+Priya.Salary+" "+Priya.employee_id);

        System.out.println(Raj.name+" " +Raj.dob+" "+Raj.isPermanent+" "+Raj.Salary+" "+Raj.employee_id);


        Priya = Raj;

        System.out.println("///////////////////");

        System.out.println(akki.name+" " +akki.dob+" "+akki.isPermanent+" "+akki.Salary+" "+akki.employee_id);

        System.out.println(Priya.name+" " +Priya.dob+" "+akki.isPermanent+" "+Priya.Salary+" "+Priya.employee_id);

        System.out.println(Raj.name+" " +Raj.dob+" "+Raj.isPermanent+" "+Raj.Salary+" "+Raj.employee_id);

        Raj = akki;

        System.out.println("///////////////////");

        System.out.println(akki.name+" " +akki.dob+" "+akki.isPermanent+" "+akki.Salary+" "+akki.employee_id);

        System.out.println(Priya.name+" " +Priya.dob+" "+akki.isPermanent+" "+Priya.Salary+" "+Priya.employee_id);

        System.out.println(Raj.name+" " +Raj.dob+" "+Raj.isPermanent+" "+Raj.Salary+" "+Raj.employee_id);

    }


}
