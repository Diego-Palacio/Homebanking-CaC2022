package com.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.models.User;
//Conector directo con la base de datos , encargado de hacer las operaciones crud
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}

