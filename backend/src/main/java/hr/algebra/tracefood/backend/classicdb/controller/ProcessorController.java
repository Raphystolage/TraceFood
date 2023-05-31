package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import hr.algebra.tracefood.backend.classicdb.service.ProcessorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processor")
public class ProcessorController extends AbstractClassicDBStorableController<Processor> {

    public ProcessorController(ProcessorService service) {
        super(service);
    }

}
