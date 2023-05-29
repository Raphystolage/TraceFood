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
    private Long senderId;
    private Long receiverId;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    public Transport() {}
    public Transport(Long id, Operation operation, Product product, Long senderId, Long receiverId, LocalDate departureDate, LocalDate arrivalDate) {
        this.id = id;
        this.operation = operation;
        this.product = product;
        this.senderId = senderId;
        this.receiverId = receiverId;
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
    public Long getSenderId() {
        return senderId;
    }
    public Long getReceiverId() {
        return receiverId;
    }
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

}
