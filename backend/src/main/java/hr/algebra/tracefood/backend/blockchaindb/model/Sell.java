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
    @ManyToOne
    @JoinColumn(name = "sellerId")
    private User seller;
    @ManyToOne
    @JoinColumn(name = "buyerId")
    private User buyer;
    private LocalDate date;

    public Sell() {}
    public Sell(Long id, Operation operation, Product product, User seller, User buyer, LocalDate date) {
        this.operation = operation;
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
        this.date = date;
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }
    public User getSeller() {
        return seller;
    }
    public User getBuyer() {
        return buyer;
    }
    public LocalDate getDate() {
        return date;
    }
    public Operation getOperation() {
        return operation;
    }

}
