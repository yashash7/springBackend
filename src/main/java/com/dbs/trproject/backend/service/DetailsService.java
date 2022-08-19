package com.dbs.trproject.backend.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import com.dbs.trproject.backend.model.User;


public class DetailsService implements UserDetails {
	
	String userName;
	String password;
	String roles;
	List<GrantedAuthority> grantedAuthList = new ArrayList<GrantedAuthority>();

	public DetailsService(User user) {
		// TODO Auto-generated constructor stub
		this.userName = user.getUsername();
		this.password = user.getPassword();
		this.roles = user.getRoles();
		
		
		String[] allRoles = roles.split(",");
		String eachRole = "";
		List<GrantedAuthority> localAuthList = new ArrayList<GrantedAuthority>();
		for(int i=0;i<allRoles.length;i++) {
			eachRole = allRoles[i];
			localAuthList.add(new SimpleGrantedAuthority(eachRole));
		}
		this.grantedAuthList = localAuthList;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return grantedAuthList;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}