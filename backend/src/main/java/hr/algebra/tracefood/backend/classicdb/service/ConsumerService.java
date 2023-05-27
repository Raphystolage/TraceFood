package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Consumer;
import hr.algebra.tracefood.backend.classicdb.repository.ConsumerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService extends AbstractClassicDBStorableService<Consumer> {
    public ConsumerService(ConsumerRepository repository) {
        super(repository);
    }
}
