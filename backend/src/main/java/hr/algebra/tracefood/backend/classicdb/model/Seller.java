package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @Enumerated(value = EnumType.STRING)
    private SellerType type;
    private String address;

    public Seller() {}
    public Seller(Long id, User user, SellerType type, String address) {
        this.id = id;
        this.user = user;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }
    public User getUser() {
        return user;
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
    public void setUser(User user) {
        this.user = user;
    }
    public void setType(SellerType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
