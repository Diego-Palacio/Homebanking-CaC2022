package repositories;


import org.springframework.stereotype.Repository;

import models.User;

import org.springframework.data.repository.CrudRepository;

//Conector directo con la base de datos , encargado de hacer las operaciones crud

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
