package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Consumer;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService extends AbstractClassicDBStorableService<Consumer> {

    public ConsumerService() {
        super("/consumer", Consumer.class);
    }

}
