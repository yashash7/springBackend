package com.dbs.trproject.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.trproject.backend.model.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	
}