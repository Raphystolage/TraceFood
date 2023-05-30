package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {}
