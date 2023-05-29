package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Producer")
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @Enumerated(value = EnumType.STRING)
    private ProducerType type;
    private String address;

    public Producer() {}
    public Producer(Long id, User user, ProducerType type, String address) {
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
    public ProducerType getType() {
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
    public void setType(ProducerType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
