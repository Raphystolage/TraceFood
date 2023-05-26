package hr.algebra.tracefood.webapp;

import hr.algebra.tracefood.webapp.model.Consumer;
import hr.algebra.tracefood.webapp.service.ConsumerService;

import java.util.List;

public class ConsumerTest {

    public static ConsumerService consumerService = new ConsumerService();

    public static void getAllTest() {
        List<Consumer> consumers = consumerService.getAll();
        for(Consumer consumer : consumers) {
            System.out.println(consumer.getUsername()+" "+consumer.getEmailAddress()+" "+consumer.getPassword());
        }
    }
    public static void getByIdTest(Long id) { //Fais un getAllTest() pour voir les id dispo
        Consumer readConsumer = consumerService.getById(id);
        System.out.println(readConsumer.getUsername()+" "+readConsumer.getEmailAddress()+" "+readConsumer.getPassword());
    }
    public static void createTest() {
        Consumer newConsumer = new Consumer();
        newConsumer.setUsername("Username");
        newConsumer.setEmailAddress("email.address@test.com");
        newConsumer.setPassword("Password");
        consumerService.create(newConsumer);

        getAllTest();
    }
    public static void updateTest(Long id) { //Idem
        Consumer readConsumer = consumerService.getById(id);
        readConsumer.setUsername("NewUsername");
        readConsumer.setEmailAddress("new.email.address@test.com");
        readConsumer.setPassword("NewPassword");
        consumerService.update(readConsumer);

        getAllTest();
    }
    public static void deleteTest(Long id) { //Idem
        consumerService.deleteById(id);

        getAllTest();
    }

    public static void main(String[] args) {
        //Les mdp seront incompréhensibles car hashés
    }

}
