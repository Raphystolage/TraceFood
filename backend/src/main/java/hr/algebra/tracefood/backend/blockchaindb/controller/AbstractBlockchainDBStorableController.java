package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.AbstractStorableController;
import hr.algebra.tracefood.backend.blockchaindb.service.AbstractBlockchainDBStorableService;
import org.springframework.stereotype.Controller;

@Controller
public abstract class AbstractBlockchainDBStorableController<T> extends AbstractStorableController<T> {

    public AbstractBlockchainDBStorableController(AbstractBlockchainDBStorableService<T> service) {
        super(service);
    }

}
