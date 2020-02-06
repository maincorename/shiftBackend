package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IMealsRepository;

import java.util.List;

public class MealService implements IMealService{

    @Autowired
    IMealsRepository mealsRepository;

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
}
