package com.debian.grupo7.repository.crud;


import com.debian.grupo7.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author: Diego Parra
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);

}
