package myproject.beerrestwithbaseauth.beerrestwithbaseauth.repositories;



import myproject.beerrestwithbaseauth.beerrestwithbaseauth.entities.BeerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
}