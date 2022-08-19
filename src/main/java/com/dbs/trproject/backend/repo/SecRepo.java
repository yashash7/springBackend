package com.dbs.trproject.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dbs.trproject.backend.model.User;

public interface SecRepo extends JpaRepository<User, Integer>{

	User findByUserName(String username);
	
}
