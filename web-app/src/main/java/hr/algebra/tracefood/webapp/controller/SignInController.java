package hr.algebra.tracefood.webapp.controller;


import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.DistributorService;
import hr.algebra.tracefood.webapp.service.ProcessorService;
import hr.algebra.tracefood.webapp.service.ProducerService;
import hr.algebra.tracefood.webapp.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SignInController {
/*
    @Autowired
    public ProcessorService processorService;

    @Autowired
    public DistributorService distributorService;

    @Autowired
    public ProducerService producerService;

    @Autowired
    public SellerService sellerService;

    public final List<Processor> processors = processorService.getAll();
    public final List<Distributor> distributors = distributorService.getAll();
    public final List<Producer> producers = producerService.getAll();
    public final List<Seller> sellers = sellerService.getAll();
*/
    @GetMapping("/signIn")
    public String signIn(Model model) {
        model.addAttribute("error", false);
        return "signIn";
    }

    @GetMapping("/chooseUserType")
    public String chooseUserType(Model model) {
        return "chooseUserType";
    }

/*
    @PostMapping("/login")
    public String SignIn(@RequestParam("emailAddress") String emailAddress, @RequestParam("password") String password, Model model) {

        boolean connexionSuccessful = false;
        List<User> users = new ArrayList<>();

        users.addAll(processors);
        users.addAll(producers);
        users.addAll(sellers);

        for (User user : users) {
            if (user.getEmailAddress().equals(emailAddress) && user.getPassword().equals(password)) {
                connexionSuccessful = true;
            }
        }

        if (connexionSuccessful) {
            model.addAttribute("error", true);
            //TODO creer la session
            return "redirect:/signUpDistributor"; //TODO retourner la bonne page
        } else {
            return "signUpDistributor";
        }
    }

 */

}
