package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Processing;

import org.springframework.stereotype.Service;

@Service
public class ProcessingService extends AbstractBlockchainDBStorableService<Processing> {

    public ProcessingService() {
        super("/processing", Processing.class);
    }

}
