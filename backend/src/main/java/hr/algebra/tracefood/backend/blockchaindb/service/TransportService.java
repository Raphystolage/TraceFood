package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import hr.algebra.tracefood.backend.blockchaindb.repository.TransportRepository;
import org.springframework.stereotype.Service;

@Service
public class TransportService extends AbstractBlockchainDBStorableService<Transport> {
    public TransportService(TransportRepository repository) {
        super(repository);
    }
}
