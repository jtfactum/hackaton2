package com.example.HakatonSpring.accessingDataMySql;

import com.example.HakatonSpring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}