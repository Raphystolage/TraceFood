package hr.algebra.tracefood.webapp.model;

public class Seller {

    private Long id;
    private User user;
    private SellerType type;

    public Seller() {}
    public Seller(User user, SellerType type) {
        this.id = null;
        this.user = user;
        this.type = type;
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

    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setType(SellerType type) {
        this.type = type;
    }

}
