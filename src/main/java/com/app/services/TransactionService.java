package com.app.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.models.Transaction;
import com.app.repositories.TransactionRepository;
import com.app.repositories.accountRepository;

@Service
public class TransactionService {
	
		private TransactionRepository repo;
		
		public TransactionService(TransactionRepository repo) {
			this.repo = repo;
		}
		
		
		public Transaction create(Transaction transaction) {
	        return repo.save(transaction);
	    }

	    public Transaction update(Transaction transaction) {
	        return repo.save(transaction);
	    }

	    public Transaction change(Transaction transaction) {
	        return repo.save(transaction);
	    }

	    public boolean remove(long id) {
	        if (repo.existsById(id)) {
	        	repo.deleteById(id);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Optional<Transaction> find(long id) {
	        return repo.findById(id);
	    }
	    
	    public Iterable<Transaction> findAll(){
	    	return repo.findAll();
	    }
	}
