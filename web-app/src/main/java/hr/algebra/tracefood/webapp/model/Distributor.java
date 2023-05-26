package hr.algebra.tracefood.webapp.model;

import java.util.List;

public class Distributor extends User {

    public Distributor() {}
    public Distributor(Long id, String emailAddress, String password, String companyName, List<CertificationType> giveableCertifications) {
        super(id, emailAddress, password, companyName, giveableCertifications);
    }
    
}
