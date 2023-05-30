package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.model.Transport;
import hr.algebra.tracefood.backend.blockchaindb.service.ProcessingService;
import hr.algebra.tracefood.backend.blockchaindb.service.TransportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transport")
public class TransportController extends AbstractBlockchainDBStorableController<Transport> {

    public TransportController(TransportService service) {
        super(service);
    }

    @GetMapping(params = "productId")
    public List<Transport> getByProductId(@RequestParam("productId") Long productId) {
        return ((TransportService) service).getByProductId(productId);
    }
/*
    @GetMapping(params = "senderId")
    public List<Transport> getBySenderId(@RequestParam("senderId") Long senderId) {
        return ((TransportService) service).getBySenderId(senderId);
    }*/

}
