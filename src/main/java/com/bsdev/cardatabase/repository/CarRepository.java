package com.bsdev.cardatabase.repository;

import com.bsdev.cardatabase.entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository  extends CrudRepository<Car,Long> {
    //fetch cars by brand
    List<Car> findByBrand(String brand);

    //fetch cars by color
    List<Car> findByColor(String color);

    //fetch cars by year
    List<Car> findByYears(int years);

    //fetch car by brand and model
    List<Car> findByBrandAndModel(String brand,String model);

    //fetch car by brand or color
    List<Car> findByBrandOrColor(String brand,String color);

    //fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearsAsc(String brand);


}
