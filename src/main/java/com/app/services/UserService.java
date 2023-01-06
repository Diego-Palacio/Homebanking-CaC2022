

package services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepository;

//capa intermediara entre la de presentacion(controllers) y la de persistencia (repositorios)
//contiene toda la logica de negocio
@Service
public class UserService {
	
	private final UserRepository userRepository;

	//injecto dependencia
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User change(User user) {
        return userRepository.save(user);
    }

    public boolean remove(long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<User> find(long id) {
        return userRepository.findById(id);
    }
    
    public Iterable<User> findAll(){
    	return userRepository.findAll();
    }
}
