package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Processing;
import hr.algebra.tracefood.webapp.model.Transport;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TransportService extends AbstractBlockchainDBStorableService<Transport> {

    public TransportService() {
        super("/transport", Transport.class);
    }

    public List<Transport> getByProductId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?productId=" + id, Transport[].class)));
    }

}
