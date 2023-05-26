package hr.algebra.tracefood.webapp.model;

import java.util.List;

public class Seller extends User {

    private String storeType;
    private String address;

    public Seller() {}
    public Seller(Long id, String emailAddress, String password, String companyName, List<CertificationType> giveableCertifications, String storeType, String address) {
        super(id, emailAddress, password, companyName, giveableCertifications);
        this.storeType = storeType;
        this.address = address;
    }

    public String getStoreType() {
        return storeType;
    }
    public String getAddress() {
        return address;
    }

    public void setStoreType(String type) {
        this.storeType = type;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
