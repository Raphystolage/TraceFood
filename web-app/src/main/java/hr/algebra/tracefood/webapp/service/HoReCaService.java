package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.HoReCa;
import hr.algebra.tracefood.webapp.model.HoReCaType;
import hr.algebra.tracefood.webapp.model.Producer;
import hr.algebra.tracefood.webapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class HoReCaService extends AbstractClassicDBStorableService<HoReCa> {

    public HoReCaService() {
        super("/hoReCa", HoReCa.class);
    }

    public HoReCa getByUserId(Long userId) {
        return restTemplate.getForObject(url+"?userId="+userId,HoReCa.class);
    }
    public HoReCa createHoReCaOptimized(String userEmailAddress, String userPassword, String userCompanyName, String userAddress, HoReCaType type) {
        UserService userService = new UserService();
        User newUser = userService.create(new User(userEmailAddress,userPassword,userCompanyName,userAddress));
        return super.create(new HoReCa(newUser,type));
    }

}
