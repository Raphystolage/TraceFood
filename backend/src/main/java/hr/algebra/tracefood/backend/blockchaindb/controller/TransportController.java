package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import hr.algebra.tracefood.backend.blockchaindb.service.TransportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transport")
public class TransportController extends AbstractBlockchainDBStorableController<Transport> {

    public TransportController(TransportService service) {
        super(service);
    }

}
