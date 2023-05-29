package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Sell;
import hr.algebra.tracefood.backend.blockchaindb.repository.SellRepository;
import org.springframework.stereotype.Service;

@Service
public class SellService extends AbstractBlockchainDBStorableService<Sell> {
    public SellService(SellRepository repository) {
        super(repository);
    }
}
