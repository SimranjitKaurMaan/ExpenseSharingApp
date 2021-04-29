package com.simran;

import com.simran.models.Expense;
import com.simran.models.User;
import com.simran.services.ExpenseService;
import com.simran.services.UserService;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        UserService userService = new UserService();
        User user1 = new User("A","a@gmail.com","1234");
        User user2 = new User("B","b@gmail.com","2345");
        userService.AddUser(user1);
        userService.AddUser(user2);
        ExpenseService expenseService = new ExpenseService();
        expenseService.CreateExpense("A","B",10);
        expenseService.CreateExpense("B","A",5);
        List<Expense> expenseList = expenseService.getExpenses("B");
        for(int i=0;i<expenseList.size();i++)
        {
            System.out.println(expenseList.get(i).getAmount());
        }
    }
}
