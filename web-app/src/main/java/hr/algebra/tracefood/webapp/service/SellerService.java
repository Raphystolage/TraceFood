package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

@Service
public class SellerService extends AbstractClassicDBStorableService<Seller> {

    public SellerService() {
        super("/seller", Seller.class);
    }

    public Seller getByUserId(Long userId) {
        return restTemplate.getForObject(url+"?userId="+userId,Seller.class);
    }
    public Seller createSellerOptimized(String userEmailAddress, String userPassword, String userCompanyName, String userAddress, SellerType type) {
        UserService userService = new UserService();
        User newUser = userService.create(new User(userEmailAddress,userPassword,userCompanyName,userAddress));
        return super.create(new Seller(newUser,type));
    }

}
