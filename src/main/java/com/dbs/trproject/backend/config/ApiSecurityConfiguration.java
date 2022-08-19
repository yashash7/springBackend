package com.dbs.trproject.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dbs.trproject.backend.service.DetailsService;
import com.dbs.trproject.backend.service.JPASecService;

@Configuration
@EnableWebSecurity
public class ApiSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	JPASecService service;
	/* Authentication */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//JPA Auth
		auth.userDetailsService(service);
		
		
		// In Memory Auth
		/*auth.inMemoryAuthentication()
		.withUser("admin")
		.password("Admin")
		.roles("ADMIN")
		.and()
		.withUser("yck")
		.password("Password")
		.roles("USER");*/
	}
	
	/* Authorization */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/get", "/post", "/put", "delete", "/dashboard").hasAnyAuthority("ADMIN", "USER")
		.antMatchers("/home").permitAll()
		.and()
		.headers().frameOptions().disable()
		.and()
		.formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
