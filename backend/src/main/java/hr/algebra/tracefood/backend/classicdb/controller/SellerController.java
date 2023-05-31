package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.model.Seller;
import hr.algebra.tracefood.backend.classicdb.service.ProducerService;
import hr.algebra.tracefood.backend.classicdb.service.SellerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("seller")
public class SellerController extends AbstractClassicDBStorableController<Seller> {

    public SellerController(SellerService service) {
        super(service);
    }

    @GetMapping(params = "userId")
    public Seller getByUserId(@RequestParam Long userId) {
        return ((SellerService) service).getByUserId(userId);
    }

}
