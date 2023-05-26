package hr.algebra.tracefood.webapp.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Production extends Operation {

    private Product createdProduct;
    private Producer producer;
    private LocalDate date;

    public Production() {}
    public Production(Long id, String description, List<Certification> addedCertifications, Product createdProduct, Producer producer, LocalDate date) {
        super(id, description, addedCertifications);
        this.createdProduct = createdProduct;
        this.producer = producer;
        this.date = date;
    }

    public Product getCreatedProduct() {
        return createdProduct;
    }
    public Producer getProducer() {
        return producer;
    }
    public LocalDate getDate() {
        return date;
    }
    
}
