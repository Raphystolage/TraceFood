package hr.algebra.tracefood.backend.blockchaindb.model;

import hr.algebra.tracefood.backend.classicdb.model.CertificationType;
import jakarta.persistence.*;

@Entity
@Table(name="Certification")
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long certificationTypeId;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "addDuringOperationId")
    private Operation addDuringOperation;
    private int value;

    public Certification() {}
    public Certification(Long id, Long certificationTypeId, Product product, Operation addDuringOperation, int value) {
        this.id = id;
        this.certificationTypeId = certificationTypeId;
        this.product = product;
        this.addDuringOperation = addDuringOperation;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    public Long getCertificationTypeId() {
        return certificationTypeId;
    }
    public Product getProduct() {
        return product;
    }
    public Operation getAddDuringOperation() {
        return addDuringOperation;
    }
    public int getValue() {
        return value;
    }

}
