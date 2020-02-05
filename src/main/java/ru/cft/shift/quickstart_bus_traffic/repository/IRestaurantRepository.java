package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.RestaurantEntity;

public interface IRestaurantRepository extends CrudRepository<RestaurantEntity, Long> {
    RestaurantEntity getRestaurantEntityByName(String name);
}
