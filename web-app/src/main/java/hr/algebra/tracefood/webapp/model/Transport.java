package hr.algebra.tracefood.webapp.model;

import java.time.LocalDate;
import java.util.List;

public class Transport extends Operation {

    private Product product;
    private Distributor distributor;
    private User sender;
    private User receiver;
    private LocalDate departureDate;
    private LocalDate arrivalDate;

    public Transport() {}
    public Transport(Long id, String description, List<Certification> addedCertifications, Product product, Distributor distributor, User sender, User receiver, LocalDate departureDate, LocalDate arrivalDate) {
        super(id, description, addedCertifications);
        this.product = product;
        this.distributor = distributor;
        this.sender = sender;
        this.receiver = receiver;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    public Product getProduct() {
        return product;
    }
    public Distributor getDistributor() {
        return distributor;
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
