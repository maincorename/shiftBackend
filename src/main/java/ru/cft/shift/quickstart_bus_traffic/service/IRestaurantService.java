package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;

public interface IRestaurantService {
    RestaurantEntity add(RestaurantEntity restaurant);
    RestaurantEntity add(String name, String description, String image);
    RestaurantEntity addMeal(String name, String mealName);
    RestaurantEntity get(Long id);
}
