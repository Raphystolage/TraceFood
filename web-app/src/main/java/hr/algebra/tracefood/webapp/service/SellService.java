package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Sell;

import org.springframework.stereotype.Service;

@Service
public class SellService extends AbstractBlockchainDBStorableService<Sell> {

    public SellService() {
        super("/sell", Sell.class);
    }

}
