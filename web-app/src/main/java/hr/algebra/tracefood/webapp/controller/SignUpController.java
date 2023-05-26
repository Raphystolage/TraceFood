package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @GetMapping("/signUpDistributor")
    public String signUpDistributor() {
        return "signUpDistributor";
    }

    @PostMapping("/signUpDistributor")
    public String SignUpDistributorForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password) {
        User newDistributor = new Distributor(null, companyName, emailAddress, password, null);
        return "signUpDistributor"; //TODO retourner la bonne page
    }

}
