package com.dbs.trproject.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.trproject.backend.repo.AccountRepository;
import com.dbs.trproject.backend.repo.DangerListRepository;
import com.dbs.trproject.backend.repo.TransactionRepository;

@Service
public class BackendService {
	
	@Autowired
	AccountRepository accRepo;
	@Autowired
	DangerListRepository dangerListRepo;
	@Autowired
	TransactionRepository transactRepo;
	
}
