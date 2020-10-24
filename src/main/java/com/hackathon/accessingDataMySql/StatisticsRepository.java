package com.example.HakatonSpring.accessingDataMySql;

import com.example.HakatonSpring.model.History;
import com.example.HakatonSpring.model.Statistics;
import com.example.HakatonSpring.model.User;
import org.springframework.data.repository.CrudRepository;

public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {
    Iterable<Statistics> findAllByUser(User user);
}
