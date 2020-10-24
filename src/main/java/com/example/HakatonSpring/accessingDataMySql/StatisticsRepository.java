package com.example.HakatonSpring.accessingDataMySql;

import com.example.HakatonSpring.model.Games;
import com.example.HakatonSpring.model.History;
import com.example.HakatonSpring.model.Statistics;
import com.example.HakatonSpring.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {
    Iterable<Statistics> findAllByUser(User user);

    boolean existsByGamesAndUser(Games games, User user);

    List<Statistics> findAllByGamesAndUser(Games games, User user);
}
