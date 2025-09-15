package com.example.SpringExpense.Controller;

import com.example.SpringExpense.DTO.ExpenseDTO;
import com.example.SpringExpense.IO.ExpenseResponse;
import com.example.SpringExpense.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class ExpenseController {
    private final ExpenseService expenseService;
    private final ModelMapper modelMapper;
    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpenses() {
        List<ExpenseDTO> list = expenseService.getAllExpenses();
        List<ExpenseResponse> expenseResponses = list.stream().map(expenseDTO -> mapToExpenseDTO(expenseDTO)).collect(Collectors.toList());
        return  expenseResponses;
    }

    public ExpenseResponse mapToExpenseDTO(ExpenseDTO expenseDTO) {
        return modelMapper.map(expenseDTO, ExpenseResponse.class);
    }
}
