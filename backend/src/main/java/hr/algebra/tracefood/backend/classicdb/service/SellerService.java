package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Seller;
import hr.algebra.tracefood.backend.classicdb.repository.SellerRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerService extends AbstractClassicDBStorableService<Seller> {
    public SellerService(SellerRepository repository) {
        super(repository);
    }
}
