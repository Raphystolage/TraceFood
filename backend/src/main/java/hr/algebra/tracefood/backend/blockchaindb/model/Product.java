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
    private Long foodId;
    private String name;
    @Enumerated(EnumType.STRING)
    private ProductType type;

    public Product() {}
    public Product(Long id, Product parent, Long foodId, String name, ProductType type) {
        this.id = id;
        this.parent = parent;
        this.foodId = foodId;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public Product getParent() {
        return parent;
    }
    public Long getFoodId() {
        return foodId;
    }
    public String getName() {
        return name;
    }
    public ProductType getType() {
        return type;
    }

}
