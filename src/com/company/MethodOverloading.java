package com.company;

public class MethodOverloading {


    public void searchData (String name , int Amount){


    }

    public void searchData (int Amount , String name){


    }

    public String searchData (int Amount , String name ,  String category) {

    return category;

    }

    public void paymentMethod(int cardNumber , int cvv){


    }

    public void paymentMethod(long MobileNumber , int upiId){


    }

    public void paymentMethod(String BankName , String bankURL){


    }


    public static void main (String[] args){

        MethodOverloading mt = new MethodOverloading();

        mt.searchData("Nike",2000);

        mt.searchData(2000,"Nike");

        mt.searchData(2000,"Nike","Shoes");


    }


}
