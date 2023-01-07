package com.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public Long user_id;
	public Long account_id;
	public int ammount;
	
	public Transaction(){}
	
	
}
