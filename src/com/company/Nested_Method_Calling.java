package com.company;

public class Nested_Method_Calling {

    public static void main(String[] args){

        Nested_Method_Calling nested = new Nested_Method_Calling();
        nested.firstMethod();

    }


    public void firstMethod(){
        System.out.println("This is first Method calling Second Method");
        secondMethod(); // When method Calling other method of same Class..Class/Object refName name is not required.

    }

    public  void secondMethod(){

        System.out.println("This is Second Method calling Third Method");
        thirdMethod();
    }

    public void thirdMethod(){
        System.out.println("This is the Third Method");

    }


}
