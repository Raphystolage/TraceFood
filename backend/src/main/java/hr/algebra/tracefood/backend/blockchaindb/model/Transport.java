package hr.algebra.tracefood.backend.blockchaindb.model;

import hr.algebra.tracefood.backend.classicdb.model.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Transport")
public class Transport {

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
    @JoinColumn(name = "senderId")
    private User sender;
    @ManyToOne
    @JoinColumn(name = "receiverId")
    private User receiver;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    public Transport() {}
    public Transport(Long id, Operation operation, Product product, User sender, User receiver, LocalDate departureDate, LocalDate arrivalDate) {
        this.id = id;
        this.operation = operation;
        this.product = product;
        this.sender = sender;
        this.receiver = receiver;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public Long getId() {
        return id;
    }
    public Operation getOperation() {
        return operation;
    }
    public Product getProduct() {
        return product;
    }
    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

}
