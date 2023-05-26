package hr.algebra.tracefood.webapp;

import hr.algebra.tracefood.webapp.model.Consumer;
import hr.algebra.tracefood.webapp.service.ConsumerService;

import java.util.List;

public class ConsumerTest {
    public static void main(String[] args) {
        ConsumerService consumerService = new ConsumerService();

        //Create
        Consumer newConsumer = new Consumer();
        newConsumer.setPseudo("Pseudo");
        newConsumer.setEmailAddress("email.address@test.com");
        newConsumer.setPassword("Password");
        consumerService.create(newConsumer);

        //Read
        Consumer readConsumer = consumerService.getById(5L);
        System.out.println(readConsumer.getPseudo()+" "+readConsumer.getEmailAddress()+" "+readConsumer.getPassword());

        //Update
        readConsumer.setPseudo("NewPseudo");
        readConsumer.setEmailAddress("new.email.address@test.com");
        readConsumer.setPassword("NewPassword");
        consumerService.update(readConsumer);

        readConsumer = consumerService.getById(5L);
        System.out.println(readConsumer.getPseudo()+" "+readConsumer.getEmailAddress()+" "+readConsumer.getPassword());

        //Delete
        consumerService.deleteById(5L);

        List<Consumer> consumers = consumerService.getAll();
        for(Consumer consumer : consumers) {
            System.out.println(consumer.getPseudo()+" "+consumer.getEmailAddress()+" "+consumer.getPassword());
        }
    }
}
