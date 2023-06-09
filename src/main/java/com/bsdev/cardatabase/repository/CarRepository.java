package com.bsdev.cardatabase.repository;

import com.bsdev.cardatabase.entity.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface CarRepository  extends CrudRepository<Car,Long> {
    //fetch cars by brand
    List<Car> findByBrand(@Param("brand") String brand);

    //fetch cars by color
    List<Car> findByColor(@Param("color") String color);

    //fetch cars by year
    List<Car> findByYears(@Param("years") int years);

    //fetch car by brand and model
    List<Car> findByBrandAndModel(@Param("brand") String brand,@Param("model") String model);

    //fetch car by brand or color
    List<Car> findByBrandOrColor(@Param("brand") String brand,@Param("color") String color);

    //fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearsAsc(@Param("brand") String brand);
    @Query("Select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);


}
