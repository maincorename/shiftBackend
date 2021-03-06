package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantResponse;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IMealsRepository;
import ru.cft.shift.quickstart_bus_traffic.repository.IRestaurantRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService implements IRestaurantService {

    @Autowired
    private IMealsRepository mealsRepository;

    @Autowired
    private IRestaurantRepository restaurantRepository;

    @Override
    public RestaurantEntity add( String name, String description, String image) {
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

    @Override
    public List<RestaurantResponse> getAllResponses() {
        List<RestaurantEntity> restaurantEntityList = (List<RestaurantEntity>) restaurantRepository.findAll();
        List<RestaurantResponse> restaurantResponseList = new ArrayList<>();
        restaurantEntityList.forEach(restaurantEntity -> {
            restaurantResponseList.add(createRestaurantResponse(restaurantEntity));
        });
        return restaurantResponseList;
    }

    @Override
    public List<RestaurantEntity> getAll() {
        return (List<RestaurantEntity>) restaurantRepository.findAll();
    }

    private RestaurantResponse createRestaurantResponse(RestaurantEntity restaurantEntity ) {
        RestaurantResponse restaurantResponse = new RestaurantResponse();
        restaurantResponse.setId(restaurantEntity.getId());
        restaurantResponse.setName(restaurantEntity.getName());
        restaurantResponse.setDescription(restaurantEntity.getDescription());
        restaurantResponse.setImg(restaurantEntity.getImg());
        return restaurantResponse;
    }

    @Override
    public List<MealsEntity> getMeals() {
        return (List<MealsEntity>) mealsRepository.findAll();
    }

}
