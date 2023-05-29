package hr.algebra.tracefood.webapp.model;

import java.util.Optional;

public class Certification {

    private Long id;
    private CertificationType type;
    private Product product;
    private Optional<Integer> value;

    public Certification() {}
    public Certification(Long id, CertificationType type, Product product, Optional<Integer> value) {
        this.id = id;
        this.type = type;
        this.product = product;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    public CertificationType getType() {
        return type;
    }
    public Product getProduct() {
        return product;
    }
    public Optional<Integer> getValue() {
        return value;
    }

}
