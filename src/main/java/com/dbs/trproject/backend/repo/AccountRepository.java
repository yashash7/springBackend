package com.dbs.trproject.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.trproject.backend.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
}