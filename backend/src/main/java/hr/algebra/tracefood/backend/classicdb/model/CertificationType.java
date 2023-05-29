package hr.algebra.tracefood.backend.classicdb.model;

import hr.algebra.tracefood.backend.blockchaindb.model.Certification;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="CertificationType")
public class CertificationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToMany
    @JoinTable(name = "CertificationTypeGiveableByUser",
            joinColumns = @JoinColumn(name = "certificationTypeId"),
            inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<User> giveableByUsers;

    public CertificationType() {}
    public CertificationType(Long id, String name, String description, List<User> giveableByUsers) {
        this.id = id;
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
