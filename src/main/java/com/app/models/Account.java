package com.app.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
//import utils.AccountType;

@Data
@AllArgsConstructor
@Entity
@Table(name = "accounts")

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_account;
	public String name;
	public Double ammount;
	public String cbu;

	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_user")
	public User user;
	
	
	//public AccountType type;
	
	public Account() {}
	
	
}
