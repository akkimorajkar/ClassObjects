package com.company;

public class Private_Setter_Getter {

    private String password;

    public String custId;

    private String financialStatemet;

    public static void main (String[] args){

    }

    public String getPassword() {

        // Setter & Getters  can be generated using generate in intellij
        // Setters are used to et the values & getter are used to get the values for private data members
        //Encapsulation is Accessing the private members via Public layer and not giving the access to the user directy

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFinancialStatement() {
        return financialStatemet;
    }

    public void setFinancialStatement(String financialStatemet) {
        this.financialStatemet = financialStatemet;
    }
}
