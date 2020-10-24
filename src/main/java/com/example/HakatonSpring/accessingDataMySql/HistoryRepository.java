package com.example.HakatonSpring.accessingDataMySql;


import com.example.HakatonSpring.model.History;
import com.example.HakatonSpring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<History, Integer> {
    Iterable<History> findAllByUser(User user);
}
