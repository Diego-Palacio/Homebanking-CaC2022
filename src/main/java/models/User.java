package models;

import java.util.Objects;

import lombok.Data;

//Uso la anotacion Data de lombok para generar getters,setters,Tostring,etc.
@Data
public class User {

	public long id;
	public String email;
	public String password;
	public String username;
	public int age;
	
	//Constructor por defecto que necesita la base de datos
	public User() {}

	
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
