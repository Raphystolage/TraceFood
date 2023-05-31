package hr.algebra.tracefood.webapp.service;

import hr.algebra.tracefood.webapp.model.*;
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

    public HoReCa getHoReCaByUserId(Long id) {
        HoReCaService hoReCaService = new HoReCaService();
        List<HoReCa> sellers = hoReCaService.getAll();
        for(HoReCa hoReCa : sellers) {
            if(hoReCa.getUser().getId().equals(id)) {
                return hoReCa;
            }
        }
        return null;
    }

}
