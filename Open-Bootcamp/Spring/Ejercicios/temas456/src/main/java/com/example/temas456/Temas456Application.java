package com.example.temas456;

import com.example.temas456.entities.Laptop;
import com.example.temas456.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Temas456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Temas456Application.class, args);
		Laptop laptop = new Laptop(null,"Lenovo",64,"i5","RTX 3600 Ti");
		LaptopRepository repository = (LaptopRepository) context.getBean(LaptopRepository.class);
		repository.save(laptop);

	}

}
