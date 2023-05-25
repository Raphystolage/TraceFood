package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.ClassTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("classicDatabase")
public interface ClassTestRepository extends JpaRepository<ClassTest,Long> {
}
