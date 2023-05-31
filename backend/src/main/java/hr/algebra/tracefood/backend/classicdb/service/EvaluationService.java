package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Evaluation;
import hr.algebra.tracefood.backend.classicdb.repository.EvaluationRepository;
import org.springframework.stereotype.Service;

@Service
public class EvaluationService extends AbstractClassicDBStorableService<Evaluation> {
    public EvaluationService(EvaluationRepository repository) {
        super(repository);
    }
}
