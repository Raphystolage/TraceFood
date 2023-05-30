package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Consumer;
import hr.algebra.tracefood.backend.classicdb.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController extends AbstractClassicDBStorableController<Consumer> {

    public ConsumerController(ConsumerService service) {
        super(service);
    }

}
