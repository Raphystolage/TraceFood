package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Operation;
import hr.algebra.tracefood.backend.blockchaindb.service.OperationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("operation")
public class OperationController extends AbstractBlockchainDBStorableController<Operation> {

    public OperationController(OperationService service) {
        super(service);
    }

}
