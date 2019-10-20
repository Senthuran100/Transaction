package com.company;
import java.util.*;

public class Client {

    public static void main(String[] args) {

        java.util.Date date=new java.util.Date();

        Catacory c1=new Catacory(1,"Travel");
        Catacory c2=new Catacory(2,"Food");
        Catacory c3=new Catacory(3,"Lesiure");
        Catacory c4=new Catacory(4,"Other Expense");



        Transaction t1=new Expense(1,"Travelling",date,2000.0,c1);
        Transaction t3=new Expense(2,"Food and snacks",date,1000.0,c2);
        Transaction t2=new Income(1,"Salary",date,5000.0);



        System.out.println(t1.getDate()+"   "+c1.getName());
        t2.viewtransaction();
        t1.viewtransaction();

        List <Expense> expenses = new ArrayList<Expense>();

        expenses.add((Expense) t1);
        expenses.add((Expense)t3);

        double total_expense = 0;

        for(Expense e:expenses){

            total_expense +=  e.getAmount();
            System.out.println("Name  "+ e.getName());

        }
        System.out.println("Total Expense : " + total_expense);


        Budget b1=new Budget(c1,10000.00);
        b1.viewBudget();

        double total_budget=0;
        List<Budget> budgets=new ArrayList<Budget>();
        budgets.add(b1);
        for(Budget b:budgets){
            total_budget+= b.getAmount();
        }

        System.out.println("Total Budget : "+total_budget);

        double variance= total_budget- total_expense;

        System.out.println(" Variance : " + variance );


    }
}
