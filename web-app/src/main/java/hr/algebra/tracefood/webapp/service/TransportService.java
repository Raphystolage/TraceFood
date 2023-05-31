package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class TransportService extends AbstractBlockchainDBStorableService<Transport> {

    public TransportService() {
        super("/transport", Transport.class);
    }

    public Transport createTransportOptimized(String operationDescription, Product product, User sender, User receiver, LocalDate departureDate, LocalDate arrivalDate) {
        OperationService operationService = new OperationService();
        Operation newOperation = operationService.create(new Operation(operationDescription));
        return super.create(new Transport(newOperation,product,sender,receiver,departureDate,arrivalDate));
    }

    public List<Transport> getByProductId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?productId=" + id, Transport[].class)));
    }
    public List<Transport> getBySenderId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?senderId?" + id, Transport[].class)));
    }

}
