package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Processor")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
    @Enumerated(value = EnumType.STRING)
    private ProcessorType type;
    private String address;

    public Processor() {}
    public Processor(Long id, User user, ProcessorType type, String address) {
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
    public ProcessorType getType() {
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
    public void setType(ProcessorType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
