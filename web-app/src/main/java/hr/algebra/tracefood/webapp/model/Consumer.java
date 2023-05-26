package hr.algebra.tracefood.webapp.model;

import org.apache.commons.codec.digest.DigestUtils;

public class Consumer {

    private Long id;
    private String username;
    private String emailAddress;
    private String password;

    public Consumer() {}
    public Consumer(Long id, String username, String emailAddress, String password) {
        this.id = id;
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
    public void setUsername(String pseudo) {
        this.username = username;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
