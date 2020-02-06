package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.MealsEntity;

public interface IMealsRepository extends CrudRepository<MealsEntity, Long> {
    MealsEntity getMealsEntitiesByName(String name);
}
