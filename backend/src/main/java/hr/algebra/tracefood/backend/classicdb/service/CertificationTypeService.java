package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.CertificationType;
import hr.algebra.tracefood.backend.classicdb.model.Consumer;
import hr.algebra.tracefood.backend.classicdb.repository.CertificationTypeRepository;
import hr.algebra.tracefood.backend.classicdb.repository.ConsumerRepository;
import org.springframework.stereotype.Service;

@Service
public class CertificationTypeService extends AbstractClassicDBStorableService<CertificationType> {
    public CertificationTypeService(CertificationTypeRepository repository) {
        super(repository);
    }
}
