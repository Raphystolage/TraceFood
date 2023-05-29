package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Evaluation;

import org.springframework.stereotype.Service;

@Service
public class EvaluationService extends AbstractClassicDBStorableService<Evaluation> {

    public EvaluationService() {
        super("/evaluation", Evaluation.class);
    }

}
