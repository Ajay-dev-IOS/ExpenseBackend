package com.example.SpringExpense.Service;

import com.example.SpringExpense.DTO.ExpenseDTO;

import java.util.List;

public interface ExpenseService {
    List<ExpenseDTO> getAllExpenses();
}
