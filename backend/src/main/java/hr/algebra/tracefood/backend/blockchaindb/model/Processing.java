package hr.algebra.tracefood.backend.blockchaindb.model;

import hr.algebra.tracefood.backend.classicdb.model.Processor;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Processing")
public class Processing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "operationId")
    private Operation operation;
    @ManyToOne
    @JoinColumn(name = "originProductId")
    private Product originProduct;
    @ManyToOne
    @JoinColumn(name = "newProductId")
    private Product newProduct;
    @ManyToOne
    @JoinColumn(name = "processorId")
    private Processor processor;
    private LocalDate date;

    public Processing() {}
    public Processing(Long id, Operation operation, Product originProduct, Product newProduct, Processor processor, LocalDate date) {
        this.id = id;
        this.operation = operation;
        this.originProduct = originProduct;
        this.newProduct = newProduct;
        this.processor = processor;
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
        return processor;
    }
    public LocalDate getDate() {
        return date;
    }
    
}
