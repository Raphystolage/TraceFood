package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService extends AbstractClassicDBStorableService<User> {

    public UserService() {
        super("/user", User.class);
    }

}
