package hr.algebra.tracefood.webapp;

import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class MainTest {

    public static UserService userService = new UserService();

    public static void getAllTest() {
        List<User> users = userService.getAll();
        for(User user : users) {
            System.out.println(user.getId()+" "+user.getEmailAddress()+" "+user.getPassword()+" "+user.getCompanyName());
        }
    }
    public static void getByIdTest(Long id) { //Fais un getAllTest() pour voir les id dispo
        User readUser = userService.getById(id);
        System.out.println(readUser.getId()+" "+readUser.getEmailAddress()+" "+readUser.getPassword()+" "+readUser.getCompanyName());
    }
    public static void createTest() {
        User newUser = new User();
        newUser.setCompanyName("CompanyName");
        newUser.setEmailAddress("email.address@test.com");
        newUser.setPassword("Password");
        userService.create(newUser);

        getAllTest();
    }
    public static void updateTest(Long id) { //Idem
        User readUser = userService.getById(id);
        readUser.setCompanyName("NewCompanyName");
        readUser.setEmailAddress("new.email.address@test.com");
        readUser.setPassword("NewPassword");
        userService.update(readUser);

        getAllTest();
    }
    public static void deleteTest(Long id) { //Idem
        userService.deleteById(id);

        getAllTest();
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        OperationService operationService = new OperationService();
        TransportService transportService = new TransportService();

        List<Transport> transports = transportService.getByProductId(1L);
        for(Transport transport : transports) {
            System.out.println(transport.getDepartureDate()+transport.getArrivalDate().toString());
        }

    }

}
