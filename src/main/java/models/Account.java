package models;

import lombok.Data;

@Data
public class Account {

	public Long id;
	public String name;
	public Double ammount;
	public String cbu;
	
	public Account() {}
	
	
}
