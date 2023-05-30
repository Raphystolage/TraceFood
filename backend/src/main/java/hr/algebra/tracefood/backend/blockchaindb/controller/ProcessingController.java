package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Processing;
import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import hr.algebra.tracefood.backend.blockchaindb.service.ProcessingService;
import hr.algebra.tracefood.backend.blockchaindb.service.ProductionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("processing")
public class ProcessingController extends AbstractBlockchainDBStorableController<Processing> {

    public ProcessingController(ProcessingService service) {
        super(service);
    }

    @GetMapping(params = "originProductId")
    public List<Processing> getByProductId(@RequestParam("originProductId") Long originProductId) {
        return ((ProcessingService) service).getByOriginProductId(originProductId);
    }

}
