package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.HoReCa;
import hr.algebra.tracefood.backend.classicdb.repository.HoReCaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoReCaService extends AbstractClassicDBStorableService<HoReCa> {

    public HoReCaService(HoReCaRepository repository) {
        super(repository);
    }

    @Autowired
    public UserService userService;

    public HoReCa getByUserId(Long userId) {
        return ((HoReCaRepository) repository).getByUser(userService.getById(userId).orElse(null));
    }

}
