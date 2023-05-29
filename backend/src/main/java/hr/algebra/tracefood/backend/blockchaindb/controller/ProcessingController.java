package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.service.ProcessingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processing")
public class ProcessingController extends AbstractBlockchainDBStorableController<Processing> {

    public ProcessingController(ProcessingService service) {
        super(service);
    }

}
