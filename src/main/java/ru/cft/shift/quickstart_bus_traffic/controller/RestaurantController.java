package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IRestaurantService;

@RestController
public class RestaurantController {

    @Autowired
    private IRestaurantService restaurantService;

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
}
