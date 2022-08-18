package com.dbs.trproject.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.trproject.backend.model.DangerList;

public interface DangerListRepository extends JpaRepository<DangerList, Integer> {
	
}