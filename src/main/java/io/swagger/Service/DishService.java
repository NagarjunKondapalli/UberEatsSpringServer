package io.swagger.Service;

import io.swagger.Repo.DishRepo;
import io.swagger.model.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService
{
    @Autowired
    private DishRepo dishRepo;

    public void addDish(Dishes dishes)
    {
        dishRepo.save(dishes);
    }
}
