package hr.algebra.tracefood.webapp.model;

public class Operation {

    private Long id;
    private String description;

    public Operation() {}
    public Operation(String description) {
        this.id = null;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

}
