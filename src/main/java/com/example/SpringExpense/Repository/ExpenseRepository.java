package com.example.SpringExpense.Repository;

import com.example.SpringExpense.Entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

   Optional<ExpenseEntity> findByExpenseID(String expenseID);
}
