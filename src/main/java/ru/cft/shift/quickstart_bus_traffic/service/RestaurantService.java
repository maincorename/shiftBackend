package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IRestaurantRepository;

@Service
public class RestaurantService implements IRestaurantService {

    @Autowired
    private IRestaurantRepository restaurantRepository;

    @Override
    public RestaurantEntity add(RestaurantEntity restaurant) {
        return null;
    }

    @Override
    public RestaurantEntity add(String name, String description, String image) {
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setName(name);
        restaurantEntity.setDescription(description);
        restaurantEntity.setImg(image);
        return restaurantRepository.save(restaurantEntity);
    }

    @Override
    public RestaurantEntity addMeal(String name, String mealName) {
        return null;
    }

    @Override
    public RestaurantEntity get(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }
}
