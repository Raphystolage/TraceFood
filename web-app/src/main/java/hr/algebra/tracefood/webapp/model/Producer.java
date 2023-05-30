package hr.algebra.tracefood.webapp.model;

public class Producer {

    private Long id;
    private User user;
    private ProducerType type;

    public Producer() {}
    public Producer(User user, ProducerType type) {
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
    public ProducerType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setType(ProducerType type) {
        this.type = type;
    }

}
