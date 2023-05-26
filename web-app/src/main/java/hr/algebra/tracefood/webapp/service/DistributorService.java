package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Distributor;

import org.springframework.stereotype.Service;

@Service
public class DistributorService extends AbstractClassicDBStorableService<Distributor> {

    public DistributorService() {
        super("/distributor", Distributor.class);
    }

}
