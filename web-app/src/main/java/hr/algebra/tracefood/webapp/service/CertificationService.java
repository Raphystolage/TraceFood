package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Certification;

import org.springframework.stereotype.Service;

@Service
public class CertificationService extends AbstractBlockchainDBStorableService<Certification> {

    public CertificationService() {
        super("/certification", Certification.class);
    }

}
