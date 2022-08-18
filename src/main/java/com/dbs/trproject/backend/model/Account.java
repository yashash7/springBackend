package com.dbs.trproject.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	int accno;
	String name;
	double balance;
}
