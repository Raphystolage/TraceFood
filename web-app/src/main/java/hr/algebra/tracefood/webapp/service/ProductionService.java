package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ProductionService extends AbstractBlockchainDBStorableService<Production> {

    public ProductionService() {
        super("/production", Production.class);
    }

    public Production createProductionOptimized(String operationDescription, Producer producer, LocalDate date, String productName, ProductType productType, boolean isProductFinished) {
        ProductService productService = new ProductService();
        OperationService operationService = new OperationService();
        Product newProduct = productService.create(new Product(null,isProductFinished ? (new FoodService()).create(new Food()) : null,productName,productType));
        Operation newOperation = operationService.create(new Operation(operationDescription));
        return super.create(new Production(newOperation,newProduct,producer,date));
    }

    public Production getByCreatedProductId(Long id) {
        return restTemplate.getForObject(url+"?createdProductId="+id,Production.class);
    }
    public List<Production> getAllByProducerId(Long id) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?producerId=" + id, Production[].class)));
    }

    public OperationDisplay toOperationDisplay(Production production) {
        Map<String, String> attributs = new HashMap<>();
        attributs.put("operationDescription",production.getOperation().getDescription());
        attributs.put("producerCompanyName",production.getProducer().getUser().getCompanyName());
        attributs.put("productType", production.getCreatedProduct().getType().toString());
        attributs.put("productName", production.getCreatedProduct().getName());
        attributs.put("date",production.getDate().toString());
        return new OperationDisplay(production.getDate(),OperationType.PRODUCTION,attributs);
    }

}
