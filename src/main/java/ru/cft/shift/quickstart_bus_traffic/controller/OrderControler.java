package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shift.quickstart_bus_traffic.entity.OrderEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IOrderService;
import ru.cft.shift.quickstart_bus_traffic.service.IRestaurantService;

@RestController
public class OrderControler {

    @Autowired
    private IOrderService orderService;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/order/add",
            consumes = "application/x-www-form-urlencoded",
            produces = "application/json"
    ) public OrderEntity add(
            @RequestParam(name = "time") String time,
            @RequestParam(name = "count") int count,
            @RequestParam(name = "phone") Long phone,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "roomNumber") int roomNumber){
        return orderService.add(time, count, phone,name,roomNumber);
    }


}
