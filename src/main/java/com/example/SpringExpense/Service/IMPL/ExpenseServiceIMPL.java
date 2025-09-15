package com.example.SpringExpense.Service.IMPL;

import com.example.SpringExpense.DTO.ExpenseDTO;
import com.example.SpringExpense.Entity.ExpenseEntity;
import com.example.SpringExpense.Repository.ExpenseRepository;
import com.example.SpringExpense.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseServiceIMPL implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;
    @Autowired
    ModelMapper modelMapper;


    public List<ExpenseDTO> getAllExpenses() {
        List<ExpenseEntity> list = expenseRepository.findAll();
        List<ExpenseDTO> listOfExpenses = list.stream().map(expenseEntity -> mapToExpenseDTO(expenseEntity)).collect(Collectors.toList());
        return listOfExpenses;

    }
    public  ExpenseDTO mapToExpenseDTO(ExpenseEntity expenseEntity) {
        return modelMapper.map(expenseEntity, ExpenseDTO.class);
    }
}
