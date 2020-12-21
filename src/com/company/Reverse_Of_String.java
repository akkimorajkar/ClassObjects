package com.company;

public class Reverse_Of_String {

    public static void main (String[] args){

        String str = "Selenium";

        char[] ch = new char[str.length()];

        for (int i = 0 ; i<=str.length()-1; i++){

            ch[i] = str.charAt(i);

        }

        for (int i = ch.length-1; i>=0; i--){

            System.out.print(ch[i]);

        }

        System.out.println();

        // Another More Efficient way of doing it

        String rev = "";

        for (int i = str.length()-1 ; i>=0 ; i--){

            rev += str.charAt(i);


        }

        System.out.println("2nd Method Output = " +  rev);


    }

}
