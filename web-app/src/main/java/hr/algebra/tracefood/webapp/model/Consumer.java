package hr.algebra.tracefood.webapp.model;

import org.apache.commons.codec.digest.DigestUtils;

public class Consumer {

    private Long id;
    private String username;
    private String emailAddress;
    private String password;

    public Consumer() {}
    public Consumer(String username, String emailAddress, String password) {
        this.id = null;
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = DigestUtils.sha256Hex(password);
    }

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
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
}
