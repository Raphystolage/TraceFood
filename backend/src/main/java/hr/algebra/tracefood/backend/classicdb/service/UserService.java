package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.User;
import hr.algebra.tracefood.backend.classicdb.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractClassicDBStorableService<User> {
    public UserService(UserRepository repository) {
        super(repository);
    }
}
