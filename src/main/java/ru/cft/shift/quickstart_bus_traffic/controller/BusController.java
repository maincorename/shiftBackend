package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IBusService;

@RestController
public class BusController {
  @Autowired
  private IBusService busService;

  //Mapping может применяться как ко всему классу, так и к методу, с параметрами: method, consumes, produces, params..
  //в consumes и produces можно записывать перечисление значений { '...', '...' }
  //params="myParam" позволяет отфильтровать запросы по наличию/отсутствию определённого ПАРАМЕТРА в запросе или по его значению.
  //headers="meHeader" позволяет отфильтровать запросы по наличию/отсутствию определённого ЗАГОЛОВКА в запросе или по его значению

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/bus/add",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public BusEntity add(
      @RequestParam(name = "number") String number,
      @RequestParam(name = "modelName") String modelName) {
    return busService.add(number, modelName);
  }

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/bus/add/passenger",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public BusEntity addPassenger(
      @RequestParam(name = "number") String number,
      @RequestParam(name = "passengerName") String passengerName) {
    return busService.addPassenger(number, passengerName);
  }

  //@PathVariable, указывает на то, что данный параметр получается из адресной строки {id}

  @RequestMapping(
      method = RequestMethod.GET,
      path = "/bus/{id}",
      produces = "application/json"
  ) public BusEntity get(@PathVariable(name = "id") Long id) { return busService.get(id); }
}
