package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import hr.algebra.tracefood.backend.blockchaindb.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController extends AbstractBlockchainDBStorableController<Product> {

    public ProductController(ProductService service) {
        super(service);
    }

}
