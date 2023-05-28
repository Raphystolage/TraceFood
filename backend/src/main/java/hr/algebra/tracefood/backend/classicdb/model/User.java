package hr.algebra.tracefood.backend.classicdb.model;

import jakarta.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailAddress;
    private String password;
    private String companyName;

    public User() {}
    public User(Long id, String emailAddress, String password, String companyName) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.password = password;
        this.companyName = companyName;
    }

    public Long getId() {
        return id;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() {
        return password;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
