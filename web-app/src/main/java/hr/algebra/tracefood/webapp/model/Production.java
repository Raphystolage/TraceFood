package hr.algebra.tracefood.webapp.model;

import hr.algebra.tracefood.webapp.service.ProducerService;

import java.time.LocalDate;

public class Production {

    private Long id;
    private Operation operation;
    private Product createdProduct;
    private Long producerId;
    private LocalDate date;

    public Production() {}
    public Production(Operation operation, Product createdProduct, Producer producer, LocalDate date) {
        this.id = null;
        this.operation = operation;
        this.createdProduct = createdProduct;
        this.producerId = 1L;
        this.date = date;
    }

    public Long getId() {
        return id;
    }
    public Product getCreatedProduct() {
        return createdProduct;
    }
    public Producer getProducer() {
        return (new ProducerService()).getById(producerId);
    }
    public Long getProducerId() {
        return producerId;
    }
    public LocalDate getDate() {
        return date;
    }
    public Operation getOperation() {
        return operation;
    }
    
}
