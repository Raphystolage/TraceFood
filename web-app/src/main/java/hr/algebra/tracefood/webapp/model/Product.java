package hr.algebra.tracefood.webapp.model;

import java.util.List;
import java.util.Optional;

public class Product {

    private Long id;
    private Optional<Product> parent;
    private String name;
    private ProductType type;
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
