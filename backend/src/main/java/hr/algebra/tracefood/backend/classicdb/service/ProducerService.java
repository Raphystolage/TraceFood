package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Producer;
import hr.algebra.tracefood.backend.classicdb.model.Seller;
import hr.algebra.tracefood.backend.classicdb.repository.ProducerRepository;
import hr.algebra.tracefood.backend.classicdb.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService extends AbstractClassicDBStorableService<Producer> {

    public ProducerService(ProducerRepository repository) {
        super(repository);
    }

    @Autowired
    public UserService userService;

    public Producer getByUserId(Long userId) {
        return ((ProducerRepository) repository).getByUser(userService.getById(userId).orElse(null));
    }

}
