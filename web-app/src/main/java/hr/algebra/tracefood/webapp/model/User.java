package hr.algebra.tracefood.webapp.model;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;

public abstract class User {

    private Long id;
    private String emailAddress;
    private String password;
    private String companyName;
    private List<CertificationType> giveableCertifications;

    public User() {}
    public User(Long id, String emailAddress, String password, String companyName, List<CertificationType> giveableCertifications) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.password = DigestUtils.sha256Hex(password);
        this.companyName = companyName;
        this.giveableCertifications = giveableCertifications;
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
    public List<CertificationType> getGiveableCertifications() {
        return giveableCertifications;
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
    public void setGiveableCertifications(List<CertificationType> giveableCertifications) {
        this.giveableCertifications = giveableCertifications;
    }

}
