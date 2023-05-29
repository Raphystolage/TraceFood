package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.HoReCa;
import hr.algebra.tracefood.backend.classicdb.repository.HoReCaRepository;
import org.springframework.stereotype.Service;

@Service
public class HoReCaService extends AbstractClassicDBStorableService<HoReCa> {
    public HoReCaService(HoReCaRepository repository) {
        super(repository);
    }
}
