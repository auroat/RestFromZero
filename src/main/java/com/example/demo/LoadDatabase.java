package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
//    @Bean
//    CommandLineRunner initDatabase(EmployeeRepository repository) {
//	return args -> {
//	    log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
//	    log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
//	};
//    }

    @Bean
    CommandLineRunner initDatabase(OrderRepository orderRepository) {
	return args -> {
	    log.info("Preloading " + orderRepository.save(new Order("MacBook Pro", Status.COMPLETED)));
	    log.info("Preloading " + orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));

	    orderRepository.findAll().forEach(order -> {
		log.info("Preloaded " + order);
	    });
	};
    }
}