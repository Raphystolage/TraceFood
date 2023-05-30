package hr.algebra.tracefood.webapp.model;

import hr.algebra.tracefood.webapp.service.SellerService;
import hr.algebra.tracefood.webapp.service.UserService;

import java.time.LocalDate;

public class Transport {

    private Long id;
    private Operation operation;
    private Product product;
    private Long senderId;
    private Long receiverId;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    public Transport() {}
    public Transport(Operation operation, Product product, User sender, User receiver, LocalDate departureDate, LocalDate arrivalDate) {
        this.id = null;
        this.operation = operation;
        this.product = product;
        this.senderId = sender.getId();
        this.receiverId = receiver.getId();
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
    public User getSender() {
        return (new UserService()).getById(senderId);
    }
    public Long getReceiverId() {
        return receiverId;
    }
    public User getReceiver() {
        return (new UserService()).getById(receiverId);
    }
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

}
