package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.service.ProcessorService;
import hr.algebra.tracefood.backend.classicdb.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processor")
public class ProcessorController extends AbstractClassicDBStorableController<Processor> {

    public ProcessorController(ProcessorService service) {
        super(service);
    }

    @GetMapping(params = "userId")
    public Processor getByUserId(@RequestParam Long userId) {
        return ((ProcessorService) service).getByUserId(userId);
    }

}
