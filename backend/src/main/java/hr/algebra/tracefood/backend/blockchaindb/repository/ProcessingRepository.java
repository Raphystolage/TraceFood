package hr.algebra.tracefood.backend.blockchaindb.repository;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessingRepository extends JpaRepository<Processing, Long> {

    public List<Processing> getByOriginProduct(Product product);

}
