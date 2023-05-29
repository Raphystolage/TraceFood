package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
/* import hr.algebra.tracefood.webapp.service.HoReCaService; */
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
public class SignUpController {


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


    @GetMapping("/signIn")
    public String signIn(Model model) {
        model.addAttribute("error", false);
        return "signIn";
    }

    @GetMapping("/chooseUserType")
    public String chooseUserType(Model model) {
        return "chooseUserType";
    }

    @GetMapping("/signUpHoReCa")
    public String signUpHoReCa() {
        return "signUpHoReCa";
    }

    @GetMapping("/signUpProducer")
    public String signUpProducer() {
        return "signUpProducer";
    }

    @GetMapping("/signUpProcessor")
    public String signUpProcessor() {
        return "signUpProcessor";
    }

    @GetMapping("/signUpSeller")
    public String signUpSeller() {
        return "signUpSeller";
    }

    @PostMapping("/signUpSeller")
    public String SignUpProcessorForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type, //TODO changer le type en enum
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("certifications") List<String> certifications,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = true;

        for (Seller seller : sellers) {
            if (seller.getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, certifications, companyAddress);
            Seller newSeller = new Seller(newUser, type;
            sellerService.create(newSeller);
            session.setAttribute("user", newSeller);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProcessor";
        }

    }

    @PostMapping("/signUpProcessor")
    public String SignUpProcessorForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type, //TODO changer le type en enum
                                    @RequestParam("emailAddress") String emailAddress,
                                      @RequestParam("certifications") List<String> certifications,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = true;

        for (Processor processor: processors) {
            if (processor.getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, certifications, companyAddress);
            Processor newProcessor = new Processor(newUser, type);
            processorService.create(newProcessor);
            session.setAttribute("user", newProcessor);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProcessor";
        }

    }

    @PostMapping("/signUpProducer")
    public String SignUpProducerForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type, //TODO changer le type en enum
                                     @RequestParam("certifications") List<String> certifications,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = true;

        for (Producer producer: producers) {
            if (producer.getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, certifications, companyAddress);
            Producer newProducer = new Producer(newUser, type);
            producerService.create(newProducer);
            session.setAttribute("user", newProducer);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProducer";
        }

    }

    @PostMapping("/signUpHoReCa")
    public String SignUpHoReCaForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("companyAddress") String companyAddress,
                                   @RequestParam("certifications") List<String> certifications,
                                    @RequestParam("password") String password,
                                   @RequestParam("type") String type, //TODO changer le type en enum
                                   Model model) {

        boolean signUpSuccessful = true;

        for (HoReCa hoReCa: hoReCas) {
            if (hoReCa.getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }

        }
        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, certifications, companyAddress);
            HoReCa newHoReCa = new HoReCa(newUser, type) ;
            hoReCaService.create(newHoReCa);
            session.setAttribute("user", newProducer);
            return "redirect:/userHomePage";
        } else {
            model.addAttribute("error", true);
            return "signUpHoReCa";
        }
    }



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



}
