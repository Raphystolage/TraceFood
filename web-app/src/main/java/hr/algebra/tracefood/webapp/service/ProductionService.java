package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Production;

import org.springframework.stereotype.Service;

@Service
public class ProductionService extends AbstractBlockchainDBStorableService<Production> {

    public ProductionService() {
        super("/production", Production.class);
    }

}
