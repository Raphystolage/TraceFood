package hr.algebra.tracefood.backend.blockchaindb.repository;

import hr.algebra.tracefood.backend.blockchaindb.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {}
