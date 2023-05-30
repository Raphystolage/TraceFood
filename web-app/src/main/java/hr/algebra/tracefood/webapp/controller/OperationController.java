package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OperationController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/addAnOperation")

    public String addAnOperation() {
        HttpSession session = request.getSession();
        CertificationType certificationType = new CertificationType(1L, "Bio", "Bio");
        CertificationType certificationType2 = new CertificationType(1L, "Bio2", "Bio bis");
        List<CertificationType> certifs = new ArrayList<>();
        certifs.add(certificationType);
        certifs.add(certificationType);
        User user = new Producer(1L, "companyAdress", "companyName", "password", certifs, "");
        session.setAttribute();
        return "addAnOperation";
    }

}
