package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import hr.algebra.tracefood.backend.classicdb.repository.ProcessorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcessorService extends AbstractClassicDBStorableService<Processor> {
    public ProcessorService(ProcessorRepository repository) {
        super(repository);
    }
}
