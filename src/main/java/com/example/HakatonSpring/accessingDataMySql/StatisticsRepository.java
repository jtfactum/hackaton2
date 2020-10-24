package com.example.HakatonSpring.accessingDataMySql;

import com.example.HakatonSpring.model.Statistics;
import org.springframework.data.repository.CrudRepository;

public interface StatisticsRepository extends CrudRepository<Statistics, Integer> {

}
