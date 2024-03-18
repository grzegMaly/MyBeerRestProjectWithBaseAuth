package myproject.beerrestwithbaseauth.beerrestwithbaseauth.repositories;


import myproject.beerrestwithbaseauth.beerrestwithbaseauth.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
