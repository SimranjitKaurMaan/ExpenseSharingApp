package com.simran.models;

import java.util.UUID;

public class Expense
{
    String expense_id;
    String username_paid;
    String username_owes;
    double amount;
    boolean settled;

    public Expense(String username_paid, String username_owes, double amount)
    {
        this.expense_id = UUID.randomUUID().toString();
        this.username_paid = username_paid;
        this.username_owes = username_owes;
        this.amount = amount;
        this.settled=false;
    }

    public String getExpense_id() {
        return expense_id;
    }

    public String getUsername_paid() {
        return username_paid;
    }

    public String getUsername_owes() {
        return username_owes;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSettled() {
        return settled;
    }

    public void setSettled(boolean settled) {
        this.settled = settled;
    }
}
