package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.User;
import hr.algebra.tracefood.backend.classicdb.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController extends AbstractClassicDBStorableController<User> {

    public UserController(UserService service) {
        super(service);
    }

}
