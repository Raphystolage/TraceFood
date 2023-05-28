package hr.algebra.tracefood.backend.blockchaindb.repository;

import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {}
