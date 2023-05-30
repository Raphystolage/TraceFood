package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Processing;

import hr.algebra.tracefood.webapp.model.Production;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProcessingService extends AbstractBlockchainDBStorableService<Processing> {

    public ProcessingService() {
        super("/processing", Processing.class);
    }

    public List<Processing> getByOriginProductId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?originProductId=" + id, Processing[].class)));
    }

}
