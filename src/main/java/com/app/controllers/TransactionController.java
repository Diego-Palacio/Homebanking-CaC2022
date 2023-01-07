package com.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.models.Transaction;
import com.app.services.TransactionService;

@RestController
public class TransactionController {
	
	private final TransactionService service;
	
	public TransactionController (TransactionService service) {
		this.service = service;
	}
	

	@GetMapping("/api/transaction/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Transaction> byId(@PathVariable("id") int id) {
	    return service.find(id);
	}
	
	@GetMapping("/api/transaction/")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Transaction> getUsers(){
		return (List<Transaction>) service.findAll();
	}
	
	@PostMapping("/api/transaction/")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Transaction create(@RequestBody Transaction transaction) {
	    return service.create(transaction);
	}
	
	@PutMapping("/api/transaction/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Transaction update(@RequestBody Transaction transaction) {
	    return service.update(transaction);
	}
	
	@PatchMapping("/api/transaction/")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Transaction change(@RequestBody Transaction transaction) {
	    return service.change(transaction);
	}
	
	@DeleteMapping("/api/transaction/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Boolean delete(@PathVariable("id") int id) {
	    return service.remove(id);
	}
	
	
	
}
