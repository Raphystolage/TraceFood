package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Producer;

import org.springframework.stereotype.Service;

@Service
public class ProducerService extends AbstractClassicDBStorableService<Producer> {

    public ProducerService() {
        super("/producer", Producer.class);
    }

}
