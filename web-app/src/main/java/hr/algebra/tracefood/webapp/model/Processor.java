package hr.algebra.tracefood.webapp.model;

public class Processor {

    private Long id;
    private User user;
    private ProcessorType type;

    public Processor() {}
    public Processor(User user, ProcessorType type) {
        this.id = null;
        this.user = user;
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public ProcessorType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setType(ProcessorType type) {
        this.type = type;
    }

}
