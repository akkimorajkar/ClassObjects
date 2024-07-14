package com.company;

public class Private_Method_Access_Class {

    public static void main (String[] args){

        Private_Setter_Getter pr = new Private_Setter_Getter();
        pr.custId = "41235";
        pr.setPassword("Morajkar");
        pr.setFinancialStatement("No Finance info yet");

        System.out.println(pr.getPassword());
        System.out.println(pr.getFinancialStatement());
        System.out.println(pr.custId);

    }


}
