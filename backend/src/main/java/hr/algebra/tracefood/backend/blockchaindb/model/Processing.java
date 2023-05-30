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
    private Long processorId;
    private LocalDate date;

    public Processing() {}
    public Processing(Long id, Operation operation, Product originProduct, Product newProduct, Long processorId, LocalDate date) {
        this.id = id;
        this.operation = operation;
        this.originProduct = originProduct;
        this.newProduct = newProduct;
        this.processorId = processorId;
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
    public Long getProcessorId() {
        return processorId;
    }
    public LocalDate getDate() {
        return date;
    }
    
}
