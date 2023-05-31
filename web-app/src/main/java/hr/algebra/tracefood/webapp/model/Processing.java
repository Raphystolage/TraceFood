package hr.algebra.tracefood.webapp.model;

import hr.algebra.tracefood.webapp.service.ProcessorService;

import java.time.LocalDate;

public class Processing {

    private Long id;
    private Operation operation;
    private Product originProduct;
    private Product newProduct;
    private Long processorId;
    private LocalDate date;

    public Processing() {}
    public Processing(Operation operation, Product originProduct, Product newProduct, Processor processor, LocalDate date) {
        this.id = null;
        this.operation = operation;
        this.originProduct = originProduct;
        this.newProduct = newProduct;
        this.processorId = processor.getId();
        this.date = date;
    }

    public Long getId() {
        return id;
    }
    public Operation getOperation() {
        return operation;
    }
    public Product getOriginProduct() {
        return originProduct;
    }
    public Product getNewProduct() {
        return newProduct;
    }
    public Processor getProcessor() {
        return (new ProcessorService()).getById(processorId);
    }
    public Long getProcessorId() {
        return processorId;
    }
    public LocalDate getDate() {
        return date;
    }
    
}
