package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="HoReCa")
public class HoReCa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @Enumerated(value = EnumType.STRING)
    private HoReCaType type;
    private String address;

    public HoReCa() {}
    public HoReCa(Long id, User user, HoReCaType type, String address) {
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
    public HoReCaType getType() {
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
    public void setType(HoReCaType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
