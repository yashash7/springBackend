package com.dbs.trproject.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
	@Id
	int tid;
	int senderAccNo;
	int receiverAccNo;
	double amount;
	String status;
}
