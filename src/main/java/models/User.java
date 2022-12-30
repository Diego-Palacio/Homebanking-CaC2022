package models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
//entidad que va a pertenecer a la base de datos
//Uso la anotacion Data de lombok para generar getters,setters,Tostring,etc.

@Entity
@Data
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String email;
	public String password;
	public String username;
	public int age;
	
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
		return id == other.id;
	}
	
	
}


