package com.company;

public class Private_Method_Acess_Class {

    public static void main (String[] args){

        Private_Set_Get pr = new Private_Set_Get();
        pr.custId = "41235";
        pr.setPassword("Morajkar");
        pr.setFinancialStatemet("No Finance info yet");

        System.out.println(pr.getPassword());
        System.out.println(pr.getFinancialStatemet());
        System.out.println(pr.custId);

    }


}
