package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.HoReCa;
import org.springframework.stereotype.Service;

@Service
public class HoReCaService extends AbstractClassicDBStorableService<HoReCa> {

    public HoReCaService() {
        super("/hoReCa", HoReCa.class);
    }

}
