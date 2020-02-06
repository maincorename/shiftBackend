package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.OrderEntity;

public interface IOrderRepository extends CrudRepository<OrderEntity, Long>{
    OrderEntity getOrderEntitiesByName(String name);
}
