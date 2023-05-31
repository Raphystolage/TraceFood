package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

@Service
public class ProducerService extends AbstractClassicDBStorableService<Producer> {

    public ProducerService() {
        super("/producer", Producer.class);
    }

    public Producer getByUserId(Long userId) {
        return restTemplate.getForObject(url+"?userId="+userId,Producer.class);
    }
    public Producer createProducerOptimized(String userEmailAddress, String userPassword, String userCompanyName, String userAddress, ProducerType type) {
        UserService userService = new UserService();
        User newUser = userService.create(new User(userEmailAddress,userPassword,userCompanyName,userAddress));
        return super.create(new Producer(newUser,type));
    }

}
