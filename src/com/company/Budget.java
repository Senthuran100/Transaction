package com.company;

public class Budget {

    private Catacory catacory;

    public Catacory getCatacory() {
        return catacory;
    }

    public void setCatacory(Catacory catacory) {
        this.catacory = catacory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount;

    Budget(Catacory catacory,double amount){
        this.catacory=catacory;
        this.amount=amount;
    }

    public void addBudget(Catacory catacory,double amount){
        this.catacory=catacory;
        this.amount=amount;
    }

    public void viewBudget(){
        System.out.println("Name of the Catacory :"+ this.catacory.getName() +" Amount :"+this.amount);

    }

}
