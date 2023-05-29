package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Sell;
import hr.algebra.tracefood.backend.blockchaindb.service.SellService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sell")
public class SellController extends AbstractBlockchainDBStorableController<Sell> {

    public SellController(SellService service) {
        super(service);
    }

}
