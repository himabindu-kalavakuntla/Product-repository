package com.nisum.productrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.nisum.productrepository.repository")
public class ProductRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRepositoryApplication.class, args);
	}

}

