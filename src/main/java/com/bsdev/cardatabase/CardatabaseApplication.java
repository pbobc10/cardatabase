package com.bsdev.cardatabase;

import com.bsdev.cardatabase.entity.Car;
import com.bsdev.cardatabase.entity.Owner;
import com.bsdev.cardatabase.repository.CarRepository;
import com.bsdev.cardatabase.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardatabaseApplication {

private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		// After adding this comment the application is restarted
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello Spring Boot");

	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			// Add owner objects and save these to db.
			Owner owner1 = new Owner("Pierre","Jean");
			Owner owner2 = new Owner("Marc","Andre");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			//Add car object with link to owners and save these to db.
			carRepository.save(new Car("Ford","Mustang","Red","ADF-1121",2017,59000,owner1));
			carRepository.save(new Car("Nissan","Leaf","White","SSJ-3002",2014,29000,owner2));
			carRepository.save(new Car("Toyota","Prius","Silver","KKO-0212",2018,39000,owner1));
		};
	}

}
