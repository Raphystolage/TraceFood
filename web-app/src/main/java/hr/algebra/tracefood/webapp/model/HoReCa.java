package hr.algebra.tracefood.webapp.model;

public class HoReCa {

    private Long id;
    private User user;
    private HoReCaType type;

    public HoReCa() {}
    public HoReCa(User user, HoReCaType type) {
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
    public HoReCaType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setType(HoReCaType type) {
        this.type = type;
    }

}
