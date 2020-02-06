package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.OrderEntity;

public interface IOrderService {
    OrderEntity add(OrderEntity order);
    OrderEntity add(String time, int count, Long phone, String name, int roomNumber);
    OrderEntity get(Long id);
    //должна еще быть адаптация addMeal, лист не нужен ибо нет getAll
}
