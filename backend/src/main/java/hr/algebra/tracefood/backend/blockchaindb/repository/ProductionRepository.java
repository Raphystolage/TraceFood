package hr.algebra.tracefood.backend.blockchaindb.repository;

import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductionRepository extends JpaRepository<Production, Long> {
    public List<Production> getByCreatedProduct(Product createdProduct);
    public List<Production> getByProducerId(Long producerId);

}
