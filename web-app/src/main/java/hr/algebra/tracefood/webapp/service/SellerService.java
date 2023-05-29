package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Seller;

import org.springframework.stereotype.Service;

@Service
public class SellerService extends AbstractClassicDBStorableService<Seller> {

    public SellerService() {
        super("/seller", Seller.class);
    }

}
