package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.repository.ProcessingRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcessingService extends AbstractBlockchainDBStorableService<Processing> {
    public ProcessingService(ProcessingRepository repository) {
        super(repository);
    }
}
