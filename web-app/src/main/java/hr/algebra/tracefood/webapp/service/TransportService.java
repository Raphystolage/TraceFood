package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public List<Transport> getAllByProductId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?productId=" + id, Transport[].class)));
    }
    public List<Transport> getBySenderId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?senderId=" + id, Transport[].class)));
    }

    public OperationDisplay toOperationDisplay(Transport transport) {
        Map<String, String> attributs = new HashMap<>();
        attributs.put("operationDescription",transport.getOperation().getDescription());
        attributs.put("productType", transport.getProduct().getType().toString());
        attributs.put("productName", transport.getProduct().getName());
        attributs.put("senderCompanyName", transport.getSender().getCompanyName());
        attributs.put("receiverCompanyName", transport.getReceiver().getCompanyName());
        attributs.put("departureDate", transport.getDepartureDate().toString());
        attributs.put("arrivalDate", transport.getArrivalDate().toString());
        return new OperationDisplay(transport.getDepartureDate(),OperationType.TRANSPORT,attributs);
    }

}
