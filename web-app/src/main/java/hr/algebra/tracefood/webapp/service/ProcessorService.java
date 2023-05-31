package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

@Service
public class ProcessorService extends AbstractClassicDBStorableService<Processor> {

    public ProcessorService() {
        super("/processor", Processor.class);
    }

    public Processor createProcessorOptimized(String userEmailAddress, String userPassword, String userCompanyName, String userAddress, ProcessorType type) {
        UserService userService = new UserService();
        User newUser = userService.create(new User(userEmailAddress,userPassword,userCompanyName,userAddress));
        return super.create(new Processor(newUser,type));
    }

}
