package hr.algebra.tracefood.webapp.model;

import hr.algebra.tracefood.webapp.service.CertificationTypeService;

public class Certification {

    private Long id;
    private Long certificationTypeId;
    private Product product;
    private Operation addDuringOperation;
    private Integer value;

    public Certification() {}
    public Certification(CertificationType certificationType, Product product, Operation addDuringOperation, Integer value) {
        this.id = null;
        this.certificationTypeId = certificationType.getId();
        this.product = product;
        this.addDuringOperation = addDuringOperation;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
    public CertificationType getCertificationType() {
        return (new CertificationTypeService()).getById(certificationTypeId);
    }
    public Product getProduct() {
        return product;
    }
    public Operation getAddDuringOperation() {
        return addDuringOperation;
    }
    public Integer getValue() {
        return value;
    }

}
