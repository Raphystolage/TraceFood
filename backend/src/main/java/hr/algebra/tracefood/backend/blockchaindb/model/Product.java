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
    private Optional<Product> parent;
    private String name;
    @Enumerated
    private ProductType type;
    @OneToMany(mappedBy = "product")
    private List<Certification> certifications;

    public Product() {}
    public Product(Long id, Optional<Product> parent, String name, ProductType type, List<Certification> certifications) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.type = type;
        this.certifications = certifications;
    }

    public Long getId() {
        return id;
    }
    public Optional<Product> getParent() {
        return parent;
    }
    public String getName() {
        return name;
    }
    public ProductType getType() {
        return type;
    }
    public List<Certification> getCertifications() {
        return certifications;
    }

}
