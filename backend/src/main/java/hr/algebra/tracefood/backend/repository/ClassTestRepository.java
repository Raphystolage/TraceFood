package hr.algebra.tracefood.backend.repository;

import hr.algebra.tracefood.backend.model.ClassTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTestRepository extends JpaRepository<ClassTest,Long> {
}
