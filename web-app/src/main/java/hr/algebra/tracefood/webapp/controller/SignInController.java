package hr.algebra.tracefood.webapp.controller;


import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.HoReCaService;
import hr.algebra.tracefood.webapp.service.ProcessorService;
import hr.algebra.tracefood.webapp.service.ProducerService;
import hr.algebra.tracefood.webapp.service.SellerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    private HttpServletRequest request;

    @Autowired
    public ProcessorService processorService;

    @Autowired
    public HoReCaService hoReCaService;

    @Autowired
    public ProducerService producerService;

    @Autowired
    public SellerService sellerService;

    public final List<Processor> processors = processorService.getAll();
    public final List<HoReCa> hoReCas = hoReCaService.getAll();
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
        User rightUser = null;

        users.addAll(processors);
        users.addAll(producers);
        users.addAll(sellers);

        for (User user : users) {
            if (user.getEmailAddress().equals(emailAddress) && user.getPassword().equals(password)) {
                connexionSuccessful = true;
                rightUser = user;
            }
        }

        if (connexionSuccessful) {
            HttpSession session = request.getSession();
            switch (user.getClass().getSimpleName()) {
                case "Seller":
                    session.setAttribute("user", (Seller) rightUser);
                    break;
                case "Processor":
                    session.setAttribute("user", (Processor) rightUser);
                    break;
                case "Producer":
                   session.setAttribute("user", (Producer) rightUser);
                    break;
                case "HoReCa":
                    session.setAttribute("user", (HoReCa) rightUser);
                    break;
                default:
                    System.out.println("User type not recognized.");
                    break;
            }
            return "redirect:/userHomePage";
        } else {
            model.addAttribute("error", true);
            return "signUpHoReCa";
        }
    }

 */

}
