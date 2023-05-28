package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Producer")
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private ProducerType type;
    private String address;

    public Producer() {}
    public Producer(Long id, ProducerType type, String address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
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
    public void setType(ProducerType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
