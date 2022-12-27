package models;

import lombok.Data;
import utils.AccountType;

@Data
public class Account {

	public Long id;
	public String name;
	public Double ammount;
	public String cbu;
	
	public AccountType type;
	
	public Account() {}
	
	
}
