package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.HoReCa;
import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.service.HoReCaService;
import hr.algebra.tracefood.backend.classicdb.service.ProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hoReCa")
public class HoReCaController extends AbstractClassicDBStorableController<HoReCa> {

    public HoReCaController(HoReCaService service) {
        super(service);
    }

    @GetMapping(params = "userId")
    public HoReCa getByUserId(@RequestParam Long userId) {
        return ((HoReCaService) service).getByUserId(userId);
    }

}
