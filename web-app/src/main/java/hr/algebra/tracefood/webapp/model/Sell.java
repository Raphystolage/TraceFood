package hr.algebra.tracefood.webapp.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Sell extends Operation {

    private Product product;
    private Seller seller;
    private Optional<User> buyer;
    private LocalDate date;

    public Sell() {}
    public Sell(Long id, String description, List<Certification> addedCertifications, Product product, Seller seller, Optional<User> buyer, LocalDate date) {
        super(id, description, addedCertifications);
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }
    public Seller getSeller() {
        return seller;
    }
    public Optional<User> getBuyer() {
        return buyer;
    }
    public LocalDate getDate() {
        return date;
    }

}
