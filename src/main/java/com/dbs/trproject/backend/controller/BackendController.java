package com.dbs.trproject.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.trproject.backend.model.Account;
import com.dbs.trproject.backend.service.BackendService;

@RestController
public class BackendController {
	
	@Autowired
	BackendService service;
	
	@RequestMapping("/home")
	public String home() {
		return "Welcome to The BackEnd!!!";
	}
	
	@RequestMapping("/get")
	public String getAllRequest() {
		return "This is 'GET' Request";
	}
	
	@RequestMapping("/post")
	public String postRequest() {
		return "This is 'POST' Request";
	}
	
	@RequestMapping("/put")
	public String putRequest() {
		return "This is 'PUT' Request";
	}
	
	@RequestMapping("/delete")
	public String deleteRequest() {
		return "This is 'DELETE' Request";
	}

}
