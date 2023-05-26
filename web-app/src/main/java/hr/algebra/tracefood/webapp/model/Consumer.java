package hr.algebra.tracefood.webapp.model;

import org.apache.commons.codec.digest.DigestUtils;

public class Consumer {

    private Long id;
    private String pseudo;
    private String emailAddress;
    private String password;

    public Consumer() {}
    public Consumer(Long id, String pseudo, String emailAddress, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.emailAddress = emailAddress;
        this.password = DigestUtils.sha256Hex(password);
    }

    public Long getId() {
        return id;
    }
    public String getPseudo() {
        return pseudo;
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
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
