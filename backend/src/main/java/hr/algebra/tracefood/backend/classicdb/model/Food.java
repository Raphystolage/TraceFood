package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="Food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Food() {}
    public Food(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
