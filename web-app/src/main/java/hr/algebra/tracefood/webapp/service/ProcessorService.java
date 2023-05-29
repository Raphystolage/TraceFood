package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Processor;

import org.springframework.stereotype.Service;

@Service
public class ProcessorService extends AbstractClassicDBStorableService<Processor> {

    public ProcessorService() {
        super("/processor", Processor.class);
    }

}
