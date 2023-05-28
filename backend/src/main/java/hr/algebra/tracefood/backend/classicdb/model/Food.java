package hr.algebra.tracefood.backend.classicdb.model;

import hr.algebra.tracefood.backend.blockchaindb.model.Product;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public Food() {}
    public Food(Long id, Product product) {
        this.id = id;
        this.product = product;
    }

    public Long getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

}
