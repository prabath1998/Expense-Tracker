package com.test.mongodb.service;

import com.test.mongodb.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    private  ExpenseRepository expenseRepository;

    public void addExpense(){}

    public void updateExpense(){}

    public void getAllExpenses(){}

    public void getExpenseByName(){}

    public void deleteExpense(){}
}
