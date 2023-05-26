package hr.algebra.tracefood.webapp.model;

import java.time.LocalDate;
import java.util.List;

public class Processing extends Operation {

    private Product originProduct;
    private Product newProduct;
    private Processor processor;
    private LocalDate date;

    public Processing() {}
    public Processing(Long id, String description, List<Certification> addedCertifications, Product originProduct, Product newProduct, Processor processor, LocalDate date) {
        super(id, description, addedCertifications);
        this.originProduct = originProduct;
        this.newProduct = newProduct;
        this.processor = processor;
        this.date = date;
    }

    public Product getOriginProduct() {
        return originProduct;
    }
    public Product getNewProduct() {
        return newProduct;
    }
    public Processor getProcessor() {
        return processor;
    }
    public LocalDate getDate() {
        return date;
    }
    
}
