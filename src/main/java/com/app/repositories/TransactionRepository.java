package com.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.models.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
