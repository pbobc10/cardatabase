package com.bsdev.cardatabase.web;
import com.bsdev.cardatabase.entity.Car;
import com.bsdev.cardatabase.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;
    @RequestMapping(value = "/cars",method = GET)
    public Iterable<Car> cars(){
    return carRepository.findAll();
    }
}
