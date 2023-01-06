package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Account;

@Repository
public interface accountRepository extends CrudRepository<Account,Long> {

}
