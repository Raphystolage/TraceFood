package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.Distributor;
import hr.algebra.tracefood.webapp.model.User;
import hr.algebra.tracefood.webapp.service.DistributorService;
import hr.algebra.tracefood.webapp.service.ProcessorService;
import hr.algebra.tracefood.webapp.service.ProducerService;
import hr.algebra.tracefood.webapp.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {

    @Autowired
    public ProcessorService processorService;
    public DistributorService distributorService;
    public ProducerService producerService;
    public SellerService sellerService;

    @GetMapping("/signIn")
    public String signIn() {
        return "signIn";
    }

    @PostMapping("/login")
    public String SignIn(@RequestParam("companyName") String companyName,
                                        @RequestParam("emailAddress") String emailAddress) {
        return "signUpDistributor"; //TODO retourner la bonne page
    }

}
