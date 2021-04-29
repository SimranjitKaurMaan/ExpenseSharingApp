package com.simran.services;

import com.simran.models.Expense;

import java.util.*;

public class ExpenseService
{
    Map<String,Expense> expenseMap = new HashMap<>();

    public void CreateExpense(String username_paid,String username_owes,double amount)
    {
        Expense expense = new Expense(username_paid,username_owes,amount);
        expenseMap.put(expense.getExpense_id(), expense);
    }

    public List<Expense> getExpenses(String username)
    {
        List<Expense> pendingBalances = new ArrayList<>();
        Iterator it = expenseMap.entrySet().iterator();
         while(it.hasNext())
         {
             Map.Entry element = (Map.Entry)it.next();
             Expense expense = (Expense)element.getValue();
             if(!expense.isSettled()) {
                 if (expense.getUsername_paid().equals(username) || expense.getUsername_owes().equals(username))
                 {
                       pendingBalances.add(expense);
                 }
             }
         }

         return pendingBalances;
    }

    public void RecordSettlement(String expense_id)
    {
        expenseMap.get(expense_id).setSettled(true);
        return;
    }

}
