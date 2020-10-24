package com.example.HakatonSpring.accessingDataMySql;


import com.example.HakatonSpring.model.History;
import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<History, Integer> {

}
