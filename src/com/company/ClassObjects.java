package com.company;

public class ClassObjects{

    String emp_name;
    String emp_id;
    int salary;
    String location;

    public static void main(String[] args) {

        ClassObjects obj1 = new ClassObjects(); //  new ClassObjects() - > RHS is the Object ; obj1 - > is The Reference name of the Class Object created

        obj1.emp_name = "Akki"; // Values are assigned to the Class variables with the hel of the reference of the Class_object created
        obj1.salary = 33000;
        obj1.emp_id = "R630460";
        obj1.location = "Mumbai , Malad";

        System.out.println("Name of Employee = "+obj1.emp_name);
        System.out.println(" Emp-id of employee = "+obj1.emp_id);
        System.out.println("Salary of Employee = "+obj1.salary);
        System.out.println("Location of Employee = "+obj1.location);


        System.out.println();
        System.out.println();
        ClassObjects obj2 = new ClassObjects(); //  2nd Object got created

        obj1.emp_name = "Parag";
        obj1.salary = 83000;
        obj1.emp_id = "O630461";
        //obj1.location = "Mumbai , Andheri";

        System.out.println("Name of Employee = "+obj1.emp_name);
        System.out.println(" Emp-id of employee = "+obj1.emp_id);
        System.out.println("Salary of Employee = "+obj1.salary);
        System.out.println("Location of Employee = "+obj1.location);



    }
}
