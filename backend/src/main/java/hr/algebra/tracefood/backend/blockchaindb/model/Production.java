package hr.algebra.tracefood.backend.blockchaindb.model;

import hr.algebra.tracefood.backend.classicdb.model.Producer;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Production")
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "operationId")
    private Operation operation;
    @ManyToOne
    @JoinColumn(name = "createdProductId")
    private Product createdProduct;
    private Long producerId;
    private LocalDate date;

    public Production() {}
    public Production(Long id, Operation operation, Product createdProduct, Long producerId, LocalDate date) {
        this.id = id;
        this.operation = operation;
        this.createdProduct = createdProduct;
        this.producerId = producerId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }
    public Product getCreatedProduct() {
        return createdProduct;
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
