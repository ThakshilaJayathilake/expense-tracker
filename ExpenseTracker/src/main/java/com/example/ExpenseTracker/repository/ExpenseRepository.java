package com.example.ExpenseTracker.repository;

import com.example.ExpenseTracker.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
