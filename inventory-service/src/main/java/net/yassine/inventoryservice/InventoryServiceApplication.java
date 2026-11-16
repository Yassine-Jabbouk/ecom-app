package net.yassine.inventoryservice;

import net.yassine.inventoryservice.entities.Product;
import net.yassine.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ProductRepository repo) {
		return args -> {
			repo.save(Product.builder().name("Laptop").price(8500).quantity(12).build());
			repo.save(Product.builder().name("Printer").price(1200).quantity(30).build());
			repo.save(Product.builder().name("Phone").price(3200).quantity(25).build());
		};
	}
}