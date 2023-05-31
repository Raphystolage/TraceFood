package hr.algebra.tracefood.backend.blockchaindb.controller;

import hr.algebra.tracefood.backend.blockchaindb.model.Certification;
import hr.algebra.tracefood.backend.blockchaindb.service.CertificationService;
import hr.algebra.tracefood.backend.classicdb.controller.AbstractClassicDBStorableController;
import hr.algebra.tracefood.backend.classicdb.model.CertificationType;
import hr.algebra.tracefood.backend.classicdb.service.CertificationTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("certification")
public class CertificationController extends AbstractBlockchainDBStorableController<Certification> {

    public CertificationController(CertificationService service) {
        super(service);
    }

}
