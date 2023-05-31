package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.blockchaindb.model.Certification;
import hr.algebra.tracefood.backend.blockchaindb.repository.CertificationRepository;
import org.springframework.stereotype.Service;

@Service
public class CertificationService extends AbstractBlockchainDBStorableService<Certification> {
    public CertificationService(CertificationRepository repository) {
        super(repository);
    }
}
