package com.company;

public class TomScoot_Fizz_Buzz {

    public static void main (String[] args){

        for (int i =1 ; i<=100 ; i++){

            if (i%5 == 0){

                if (i%3== 0){

                    System.out.println("FizzBuzz");
                }
                else {

                    System.out.println("Buzz");
                }
            }

            else if (i%3 == 0){

                System.out.println("Fizz");
            }

            else{
                System.out.println(i);
            }




        }



    }
}
