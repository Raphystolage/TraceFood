package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.HoReCa;
import hr.algebra.tracefood.backend.classicdb.service.HoReCaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hoReCa")
public class HoReCaController extends AbstractClassicDBStorableController<HoReCa> {

    public HoReCaController(HoReCaService service) {
        super(service);
    }

}
