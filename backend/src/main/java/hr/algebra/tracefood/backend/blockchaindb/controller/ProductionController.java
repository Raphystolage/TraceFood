package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import hr.algebra.tracefood.backend.blockchaindb.service.ProductionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("production")
public class ProductionController extends AbstractBlockchainDBStorableController<Production> {

    public ProductionController(ProductionService service) {
        super(service);
    }

    @GetMapping(params = "productId")
    public Production getByProductId(@RequestParam("createdProductId") Long createdProductId) {
        return ((ProductionService) service).getByCreatedProductId(createdProductId);
    }

}
