package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;

import java.util.List;

public interface IMealService {
    MealsEntity add(String name, String description, Double value, String image);
    MealsEntity get(Long id);
    List<MealsEntity> getAll();
    List<MealsEntity> getAllByRestId(Long id);
}
