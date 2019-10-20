package com.company;

import java.util.Date;
import java.util.List;

abstract class Transaction {

     private int id;
     private String name;
     private Date date;

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

     Transaction(int id,String name,Date date,double amount){
         this.id=id;
         this.name=name;
         this.date=date;
         this.amount=amount;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public Date getDate() {
         return date;
     }

     public void setDate(Date date) {
         this.date = date;
     }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }


    public void viewtransaction(){

    }

    public void addtransaction(String name){

    }

}
