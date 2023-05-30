package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionService extends AbstractBlockchainDBStorableService<Production> {
    public ProductionService(ProductionRepository repository) {
        super(repository);
    }

    @Autowired
    private ProductService productService;

    public Production getByCreatedProductId(Long id) {
        return ((ProductionRepository) repository).getByCreatedProduct(productService.getById(id).orElse(null));
    }

}
