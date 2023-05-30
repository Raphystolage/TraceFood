package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Evaluation;
import hr.algebra.tracefood.backend.classicdb.service.EvaluationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("evaluation")
public class EvaluationController extends AbstractClassicDBStorableController<Evaluation> {

    public EvaluationController(EvaluationService service) {
        super(service);
    }

}
