package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<Processor, Long> {}
