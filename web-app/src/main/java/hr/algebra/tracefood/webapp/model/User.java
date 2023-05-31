package hr.algebra.tracefood.webapp.model;

import org.apache.commons.codec.digest.DigestUtils;

public class User {

    private Long id;
    private String emailAddress;
    private String password;
    private String companyName;
    private String address;

    public User() {}
    public User(String emailAddress, String password, String companyName, String address) {
        this.id = null;
        this.emailAddress = emailAddress;
        this.password = DigestUtils.sha256Hex(password);
        this.companyName = companyName;
        this.address = address;
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
    public String getAddress() {
        return address;
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
    public void hashPassword() {
        this.password = DigestUtils.sha256Hex(this.password);
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
