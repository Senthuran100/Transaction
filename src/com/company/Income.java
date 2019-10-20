package com.company;

import java.util.Date;

public class Income extends Transaction {
    Income(int id, String name, Date date,double amount){
        super(id,name,date,amount);

    }

    public void viewtransaction(){
        System.out.println("Name  of Income : "+ this.getName()+ " at "+ this.getDate()+" Amount :"+this.getAmount());
    }
}
