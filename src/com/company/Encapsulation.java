package com.company;

public class Encapsulation {

    public static void main (String[] args){ }

    public static void startBrowser() { //Encapsulation is Accessing the private members via Public layer and not giving the access to the user direct
         // Here we are accessing all the private data members (Methods) via a public layered method.
        // So when user tries to access these methods from a diff class he can only see the public data members
        System.out.println("Starting the Browser");
        Encapsulation e1 = new Encapsulation();
        e1.checkCompatibility();
        e1.browserVersion();
        e1.launchBrowser();

    }

    private void checkCompatibility(){

        System.out.println("Checking the System Compatibility");
    }

    private void browserVersion(){

        System.out.println("Checking the Browser version");
    }

    private void launchBrowser(){

        System.out.println("Browser Launched on Port 8080");
    }
}
