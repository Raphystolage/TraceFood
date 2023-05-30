package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.CertificationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationTypeRepository extends JpaRepository<CertificationType, Long> {}
