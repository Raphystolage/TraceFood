package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProductionRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductionService extends AbstractBlockchainDBStorableService<Production> {
    public ProductionService(ProductionRepository repository) {
        super(repository);
    }
}
