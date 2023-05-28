package hr.algebra.tracefood.backend.blockchaindb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Operation() {}
    public Operation(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

}
