package com.dbs.trproject.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dbs.trproject.backend.model.User;
import com.dbs.trproject.backend.repo.SecRepo;

@Service
public class JPASecService implements UserDetailsService {
	
	@Autowired
	SecRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUserName(username);
		DetailsService userDetails = new DetailsService(user);
		return userDetails;
	}

}
