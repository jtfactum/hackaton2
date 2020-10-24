package com.example.HakatonSpring.accessingDataMySql;

import com.example.HakatonSpring.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User>findByNameUser(String nameUser);

    Boolean existsByNameUser(String nameUser);

    Boolean existsByEmail(String email);

}