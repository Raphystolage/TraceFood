package hr.algebra.tracefood.backend.blockchaindb.model;

import hr.algebra.tracefood.backend.classicdb.model.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Sell")
public class Sell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "operationId")
    private Operation operation;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    private Long sellerId;
    private Long buyerId;
    private LocalDate date;

    public Sell() {}
    public Sell(Long id, Operation operation, Product product, Long sellerId, Long buyerId, LocalDate date) {
        this.operation = operation;
        this.product = product;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.date = date;
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }
    public Long getSellerId() {
        return sellerId;
    }
    public Long getBuyerId() {
        return buyerId;
    }
    public LocalDate getDate() {
        return date;
    }
    public Operation getOperation() {
        return operation;
    }

}
