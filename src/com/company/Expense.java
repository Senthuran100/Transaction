package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Expense extends Transaction{
    private Catacory catacory;
    Expense(int id, String name, Date date,double amount,Catacory cat1){

        super(id,name,date,amount);
        this.catacory=cat1;
    }

    public void viewtransaction(){
        System.out.println("Name  of Expense : "+ this.getName()+ " at "+ this.getDate()+" Amount :"+this.getAmount()+"  Catacory :" +catacory.getName());
    }

//    public void viewtransactionbycatacory(){
//        if(catacory.getId()==1) {
//
//            System.out.println("Travel total Expense"+);
//        }
//
//    }

    private List<Expense> expenses = new ArrayList<Expense>();

    public void addtransaction(List<Expense> e){
        expenses.add((Expense) e);

    }



}
