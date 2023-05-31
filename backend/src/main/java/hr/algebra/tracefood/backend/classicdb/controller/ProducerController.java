package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class ProducerController extends AbstractClassicDBStorableController<Producer> {

    public ProducerController(ProducerService service) {
        super(service);
    }

    @GetMapping(params = "userId")
    public Producer getByUserId(@RequestParam Long userId) {
        return ((ProducerService) service).getByUserId(userId);
    }

}
