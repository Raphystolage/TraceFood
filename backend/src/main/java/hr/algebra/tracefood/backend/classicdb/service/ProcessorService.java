package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import hr.algebra.tracefood.backend.classicdb.model.Seller;
import hr.algebra.tracefood.backend.classicdb.repository.ProcessorRepository;
import hr.algebra.tracefood.backend.classicdb.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessorService extends AbstractClassicDBStorableService<Processor> {

    public ProcessorService(ProcessorRepository repository) {
        super(repository);
    }

    @Autowired
    public UserService userService;

    public Processor getByUserId(Long userId) {
        return ((ProcessorRepository) repository).getByUser(userService.getById(userId).orElse(null));
    }

}
