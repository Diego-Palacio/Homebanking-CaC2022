package com.app.models;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
//entidad que va a pertenecer a la base de datos
//Uso la anotacion Data de lombok para generar getters,setters,Tostring,etc.

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String email;
	public String password;
	public String username;
	public int age;
	
	@OneToMany (mappedBy="id_account", fetch = FetchType.EAGER)
	Set<Account> account = new HashSet<>();
	
	//Constructor por defecto que necesita la base de datos
	public User() {}

	
	public User(long id, String email, String password, String username, int age) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.age = age;
	} 
	

	
	//Genero metodo hashcode y equals con solo el id de la clase (Buscar forma de hacerlo mediante lombok)
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}


