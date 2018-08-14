package io.swagger.Repo;

import io.swagger.model.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepo extends JpaRepository<Dishes,Integer> {
}
