package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractBlockchainDBStorableService<Product> {

    public ProductService() {
        super("/product", Product.class);
    }

}
