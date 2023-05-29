package hr.algebra.tracefood.webapp.model;

import java.util.List;

public abstract class Operation {

    private Long id;
    private String description;
    private List<Certification> addedCertifications;

    public Operation() {}
    public Operation(Long id, String description, List<Certification> addedCertifications) {
        this.id = id;
        this.description = description;
        this.addedCertifications = addedCertifications;
    }

    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public List<Certification> getAddedCertifications() {
        return addedCertifications;
    }

}
