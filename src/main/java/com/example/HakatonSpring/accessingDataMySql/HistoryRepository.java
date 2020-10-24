package com.example.HakatonSpring.accessingDataMySql;


import com.example.HakatonSpring.model.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoryRepository extends CrudRepository<History, Integer> {
    List<History> findAllByUser(User user);
    List<History> findAllByGamesAndUser(Games games, User user);
    boolean existsByGamesAndUser(Games games, User user);
}
