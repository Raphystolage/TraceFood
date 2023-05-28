package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private SellerType type;
    private String address;

    public Seller() {}
    public Seller(Long id, SellerType type, String address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    public SellerType getType() {
        return type;
    }
    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setType(SellerType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
