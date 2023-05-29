package hr.algebra.tracefood.backend.blockchaindb.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;

@Entity
@Table(name="Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "parentId")
    private Product parent;
    private String name;
    @Enumerated
    private ProductType type;

    public Product() {}
    public Product(Long id, Product parent, String name, ProductType type) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public Product getParent() {
        return parent;
    }
    public String getName() {
        return name;
    }
    public ProductType getType() {
        return type;
    }

}
