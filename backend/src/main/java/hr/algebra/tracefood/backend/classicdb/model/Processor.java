package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Processor")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private ProcessorType type;
    private String address;

    public Processor() {}
    public Processor(Long id, ProcessorType type, String address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
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
    public void setType(ProcessorType type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
