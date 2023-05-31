package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.*;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ProcessingService extends AbstractBlockchainDBStorableService<Processing> {

    public ProcessingService() {
        super("/processing", Processing.class);
    }

    public Processing createProcessingOptimized(String operationDescription, Product originProduct, String newProductName, ProductType newProductType,Processor processor, LocalDate date, boolean isNewProductFinished) {
        ProductService productService = new ProductService();
        OperationService operationService = new OperationService();
        Product newProduct = productService.create(new Product(originProduct,isNewProductFinished ? (new FoodService()).create(new Food()) : null,newProductName,newProductType));
        Operation newOperation = operationService.create(new Operation(operationDescription));
        return super.create(new Processing(newOperation,originProduct,newProduct,processor,date));
    }

    public List<Processing> getAllByOriginProductId(Long originProductId) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?originProductId=" + originProductId, Processing[].class)));
    }

    public List<Processing> getByProcessorId(Long processorId) {
        return List.of(Objects.requireNonNull(restTemplate.getForObject(url + "?processorId=" + processorId, Processing[].class)));
    }

    public OperationDisplay toOperationDisplay(Processing processing) {
        Map<String, String> attributs = new HashMap<>();
        attributs.put("operationDescription",processing.getOperation().getDescription());
        attributs.put("originProductName", processing.getOriginProduct().getName());
        attributs.put("originProductType", processing.getOriginProduct().getType().toString());
        attributs.put("newProductName", processing.getNewProduct().getName());
        attributs.put("newProductType", processing.getNewProduct().getType().toString());
        attributs.put("processorCompanyName", processing.getProcessor().getUser().getCompanyName());
        attributs.put("date", processing.getDate().toString());
        return new OperationDisplay(processing.getDate(),OperationType.PROCESSING,attributs);
    }

}
