package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.OrderEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IOrderRepository;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public OrderEntity add(OrderEntity order) {
        return null;
    }

    @Override
    public OrderEntity add(String time, int count, Long phone, String name, int roomNumber) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTime(time);
        orderEntity.setCount(count);
        orderEntity.setPhone(phone);
        orderEntity.setName(name);
        orderEntity.setRoomNumber(roomNumber);
        return orderRepository.save(orderEntity);
    }

    //ибо я хз как адаптировать addMeal
   /* @Override
    public OrderEntity addMeal(String name, String mealName) {
        return null;
    }*/

    @Override
    public OrderEntity get(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

}