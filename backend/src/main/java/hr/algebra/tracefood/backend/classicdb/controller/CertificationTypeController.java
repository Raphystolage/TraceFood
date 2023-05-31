package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.CertificationType;
import hr.algebra.tracefood.backend.classicdb.service.CertificationTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("certificationType")
public class CertificationTypeController extends AbstractClassicDBStorableController<CertificationType> {

    public CertificationTypeController(CertificationTypeService service) {
        super(service);
    }

}
