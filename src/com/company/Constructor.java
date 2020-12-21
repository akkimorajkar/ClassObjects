package com.company;

import java.net.ServerSocket;

public class Constructor {

    String websiteName;
    String url;
    String pageContains;
    int pageNumber;

    public Constructor() {
    }

    public Constructor(String websiteName, String url) {
        this.websiteName = websiteName;
        this.url = url;
    }

    public Constructor(String websiteName, String url, String pageContains, int pageNumber) {
        this.websiteName = websiteName;
        this.url = url;
        this.pageContains = pageContains;
        this.pageNumber = pageNumber;
    }

    public static void main (String[] args){

        Constructor const1 = new Constructor();

        Constructor const2 = new Constructor("Google" , "www.google.com");

        System.out.println(const2.websiteName+" "+const2.url);

        Constructor const3 = new Constructor("Google", "www.google.com", "Log in " ,2);

        System.out.println(const3.websiteName+" "+const3.url+" "+const3.pageContains+" "+ const3.pageNumber);

    }

}
