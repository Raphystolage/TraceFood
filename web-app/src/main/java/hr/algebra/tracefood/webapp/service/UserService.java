package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.User;
import hr.algebra.tracefood.webapp.service.AbstractClassicDBStorableService;

import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractClassicDBStorableService<User> {

    public UserService() {
        super("/user", User.class);
    }

}
