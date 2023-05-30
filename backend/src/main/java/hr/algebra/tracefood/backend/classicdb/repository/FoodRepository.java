package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {}
