package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.CertificationType;

import org.springframework.stereotype.Service;

@Service
public class CertificationTypeService extends AbstractClassicDBStorableService<CertificationType> {

    public CertificationTypeService() {
        super("/certificationType", CertificationType.class);
    }

}
