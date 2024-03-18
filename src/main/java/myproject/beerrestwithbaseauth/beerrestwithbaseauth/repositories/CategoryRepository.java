package myproject.beerrestwithbaseauth.beerrestwithbaseauth.repositories;


import myproject.beerrestwithbaseauth.beerrestwithbaseauth.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
