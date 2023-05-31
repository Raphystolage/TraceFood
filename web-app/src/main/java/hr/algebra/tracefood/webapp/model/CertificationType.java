package hr.algebra.tracefood.webapp.model;

import java.util.List;

public class CertificationType {

    private Long id;
    private String name;
    private String description;
    private List<User> giveableByUsers;

    public CertificationType() {}
    public CertificationType(String name, String description, List<User> giveableByUsers) {
        this.id = null;
        this.name = name;
        this.description = description;
        this.giveableByUsers = giveableByUsers;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public List<User> getGiveableByUsers() {
        return giveableByUsers;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setGiveableByUsers(List<User> giveableByUsers) {
        this.giveableByUsers = giveableByUsers;
    }

}
