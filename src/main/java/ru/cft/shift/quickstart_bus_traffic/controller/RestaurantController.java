package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantResponse;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IRestaurantService;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private IRestaurantService restaurantService;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/restaurant",
            produces = "application/json"
    ) public List<RestaurantResponse> getAll(){
        return restaurantService.getAllResponses();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/restaurant/add",
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    ) public RestaurantEntity add(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "description") String description,
            @RequestParam(name = "img") String img){
        return restaurantService.add(name, description, img);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/restaurant/{id}",
            produces = "application/json"
    ) public List<MealsEntity> get(@PathVariable(name = "id") Long id) { return  restaurantService.getMeals(); };
}
