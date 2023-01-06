package com.app.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.models.Account;
import com.app.repositories.accountRepository;

@Service
public class accountService {

	private accountRepository repo;
	
	public accountService(accountRepository repo) {
		this.repo = repo;
	}
	
	
	public Account create(Account user) {
        return repo.save(user);
    }

    public Account update(Account user) {
        return repo.save(user);
    }

    public Account change(Account user) {
        return repo.save(user);
    }

    public boolean remove(long id) {
        if (repo.existsById(id)) {
        	repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<Account> find(long id) {
        return repo.findById(id);
    }
    
    public Iterable<Account> findAll(){
    	return repo.findAll();
    }
}
