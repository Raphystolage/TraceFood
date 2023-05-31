package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Seller;
import hr.algebra.tracefood.backend.classicdb.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService extends AbstractClassicDBStorableService<Seller> {

    public SellerService(SellerRepository repository) {
        super(repository);
    }

    @Autowired
    public UserService userService;

    public Seller getByUserId(Long userId) {
        return ((SellerRepository) repository).getByUser(userService.getById(userId).orElse(null));
    }

}
