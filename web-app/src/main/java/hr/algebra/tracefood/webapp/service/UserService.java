package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.Processor;
import hr.algebra.tracefood.webapp.model.Producer;
import hr.algebra.tracefood.webapp.model.Seller;
import hr.algebra.tracefood.webapp.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService extends AbstractClassicDBStorableService<User> {

    public UserService() {
        super("/user", User.class);
    }

    public Producer getProducerByUserId(Long id) {
        ProducerService producerService = new ProducerService();
        List<Producer> producers = producerService.getAll();
        for(Producer producer : producers) {
            if(producer.getUser().getId().equals(id)) {
                return producer;
            }
        }
        return null;
    }

    public Processor getProcessorByUserId(Long id) {
        ProcessorService processorService = new ProcessorService();
        List<Processor> processors = processorService.getAll();
        for(Processor processor : processors) {
            if(processor.getUser().getId().equals(id)) {
                return processor;
            }
        }
        return null;
    }

    public Seller getSellerByUserId(Long id) {
        SellerService sellerService = new SellerService();
        List<Seller> sellers = sellerService.getAll();
        for(Seller seller : sellers) {
            if(seller.getUser().getId().equals(id)) {
                return seller;
            }
        }
        return null;
    }

}
