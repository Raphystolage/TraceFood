package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.Operation;
import org.springframework.stereotype.Service;

@Service
public class OperationService extends AbstractBlockchainDBStorableService<Operation> {

    public OperationService() {
        super("/operation", Operation.class);
    }

}
