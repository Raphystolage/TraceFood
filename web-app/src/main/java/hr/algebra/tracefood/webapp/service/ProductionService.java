package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Product;
import hr.algebra.tracefood.webapp.model.Production;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductionService extends AbstractBlockchainDBStorableService<Production> {

    public ProductionService() {
        super("/production", Production.class);
    }

    public Production getByCreatedProductId(Long id) {
        return restTemplate.getForObject(url+"?createdProductId="+id,Production.class);
    }
    public List<Production> getByProducerId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?producerId=" + id, Production[].class)));
    }

}
