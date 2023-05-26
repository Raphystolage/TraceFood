package hr.algebra.tracefood.webapp.model;

import java.util.List;

public class Processor extends User {

    private String type;
    private String address;

    public Processor() {}
    public Processor(Long id, String emailAddress, String password, String companyName, List<CertificationType> giveableCertifications, String type, String address) {
        super(id, emailAddress, password, companyName, giveableCertifications);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }
    public String getAddress() {
        return address;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
