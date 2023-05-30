package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractBlockchainDBStorableService<Product> {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
