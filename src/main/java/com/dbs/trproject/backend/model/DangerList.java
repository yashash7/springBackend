package com.dbs.trproject.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DangerList {
	@Id
	int sno;
	String name;
}
