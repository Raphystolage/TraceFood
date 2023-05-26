package hr.algebra.tracefood.webapp;

import hr.algebra.tracefood.webapp.model.Consumer;
import hr.algebra.tracefood.webapp.service.ConsumerService;

import java.util.List;

public class ConsumerTest {

    public static ConsumerService consumerService = new ConsumerService();

    public static void getAllTest() {
        List<Consumer> consumers = consumerService.getAll();
        for(Consumer consumer : consumers) {
            System.out.println(consumer.getPseudo()+" "+consumer.getEmailAddress()+" "+consumer.getPassword());
        }
    }
    public static void getByIdTest(Long id) { //Fais un getAllTest() pou voir les id dispo
        Consumer readConsumer = consumerService.getById(id);
        System.out.println(readConsumer.getPseudo()+" "+readConsumer.getEmailAddress()+" "+readConsumer.getPassword());
    }
    public static void createTest() {
        Consumer newConsumer = new Consumer();
        newConsumer.setPseudo("Pseudo");
        newConsumer.setEmailAddress("email.address@test.com");
        newConsumer.setPassword("Password");
        consumerService.create(newConsumer);

        getAllTest();
    }
    public static void updateTest(Long id) { //Idem
        Consumer readConsumer = consumerService.getById(id);
        readConsumer.setPseudo("NewPseudo");
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
