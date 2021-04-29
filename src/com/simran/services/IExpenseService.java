package com.simran.services;

import com.simran.models.Expense;

import java.util.List;

public interface IExpenseService
{
    void CreateExpense(String username_paid,String username_owes,double amount);

    List<Expense> getExpenses(String username);

    void RecordSettlement(String expense_id);
}
