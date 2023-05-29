package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.repository.ProducerRepository;
import org.springframework.stereotype.Service;

@Service
public class ProducerService extends AbstractClassicDBStorableService<Producer> {
    public ProducerService(ProducerRepository repository) {
        super(repository);
    }
}
