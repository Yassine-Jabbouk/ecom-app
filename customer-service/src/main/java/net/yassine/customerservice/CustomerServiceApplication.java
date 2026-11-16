package net.yassine.customerservice;

import net.yassine.customerservice.entities.Customer;
import net.yassine.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(CustomerRepository repo) {
        return args -> {
            repo.save(Customer.builder().name("Sara").email("sara@mail.com").build());
            repo.save(Customer.builder().name("Omar").email("omar@mail.com").build());
            repo.save(Customer.builder().name("Yassine").email("yassine@mail.com").build());
        };
    }
}