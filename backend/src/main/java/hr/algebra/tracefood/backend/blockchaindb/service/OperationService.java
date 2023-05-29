package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Operation;
import hr.algebra.tracefood.backend.blockchaindb.repository.OperationRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationService extends AbstractBlockchainDBStorableService<Operation> {
    public OperationService(OperationRepository repository) {
        super(repository);
    }
}
