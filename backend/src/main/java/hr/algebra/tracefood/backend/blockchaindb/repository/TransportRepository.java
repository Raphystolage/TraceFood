package hr.algebra.tracefood.backend.blockchaindb.repository;

import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {

    public List<Transport> getByProduct(Product product);
    public List<Transport> getBySenderId(Long senderId);

}
