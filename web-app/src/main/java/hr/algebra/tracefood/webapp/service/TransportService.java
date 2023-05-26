package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Transport;

import org.springframework.stereotype.Service;

@Service
public class TransportService extends AbstractBlockchainDBStorableService<Transport> {

    public TransportService() {
        super("/transport", Transport.class);
    }

}
