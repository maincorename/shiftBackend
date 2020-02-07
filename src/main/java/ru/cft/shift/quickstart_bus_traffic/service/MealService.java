package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IMealsRepository;
import ru.cft.shift.quickstart_bus_traffic.repository.IRestaurantRepository;

import java.util.List;
@Service
public class MealService implements IMealService{

    @Autowired
    IMealsRepository mealsRepository;
    @Autowired
    IRestaurantRepository restaurantRepository;

    @Override
    public MealsEntity add(String name, String description, Double value, String image) {
        MealsEntity mealsEntity = new MealsEntity();
        mealsEntity.setName(name);
        mealsEntity.setDescription(description);
        mealsEntity.setValue(value);
        mealsEntity.setImage(image);

        return mealsRepository.save(mealsEntity);
    }

    @Override
    public MealsEntity get(Long id) {
        return mealsRepository.findById(id).orElse(null);
    }

    @Override
    public List<MealsEntity> getAll() {
        return (List<MealsEntity>) mealsRepository.findAll();
    }

    @Override
    public List<MealsEntity> getAllByRestId(Long id) {
        RestaurantEntity restaurantEntity = restaurantRepository.findById(id).orElse(null);
        return restaurantEntity.getMeals();
    }
}
