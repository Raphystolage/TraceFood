package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class SignController {

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

    @GetMapping("/signIn")
    public String signIn(Model model) {
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
                                    @RequestParam("type") SellerType type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        List<Seller> sellers = sellerService.getAll();
        boolean signUpSuccessful = true;

        for (Seller seller : sellers) {
            if (seller.getUser().getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, companyAddress);
            Seller newSeller = new Seller(newUser, type);
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
                                    @RequestParam("type") ProcessorType type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        List<Processor> processors = processorService.getAll();
        boolean signUpSuccessful = true;

        for (Processor processor: processors) {
            if (processor.getUser().getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, companyAddress);
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
                                    @RequestParam("type") ProducerType type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        List<Producer> producers = producerService.getAll();
        boolean signUpSuccessful = true;

        for (Producer producer: producers) {
            if (producer.getUser().getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }

        if (signUpSuccessful) {
            HttpSession session = request.getSession();
            User newUser = new User(emailAddress, password, companyName, companyAddress);
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
                                    @RequestParam("password") String password,
                                   @RequestParam("type") String type,
                                   Model model) {

        List<HoReCa> hoReCas = hoReCaService.getAll();
        boolean signUpSuccessful = true;

        for (HoReCa hoReCa: hoReCas) {
            if (hoReCa.getUser().getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }

        }
        if (signUpSuccessful) {
            UserService userService = new UserService();
            HttpSession session = request.getSession();
            User newUser = userService.create(new User(emailAddress, password, companyName, companyAddress));
            HoReCa newHoReCa = new HoReCa(newUser, HoReCaType.valueOf(type)) ;
            hoReCaService.create(newHoReCa);
            session.setAttribute("user", newHoReCa);

            return "redirect:/userHomePage";
        } else {
            model.addAttribute("error", true);

            return "signUpHoReCa";
        }

    }



    @PostMapping("/signIn")
    public String SignIn(@RequestParam("emailAddress") String emailAddress, @RequestParam("password") String password, Model model) {

        boolean connexionSuccessful = false;
        UserService userService = new UserService();
        List<User> users = userService.getAll();
        User rightUser = null;

        for (User user : users) {
            if (user.getEmailAddress().equals(emailAddress) && user.getPassword().equals(password)) {
                connexionSuccessful = true;
                rightUser = user;
            }
        }

        if (connexionSuccessful) {
            HttpSession session = request.getSession();
            switch (rightUser.getClass().getSimpleName()) {
                case "Seller":
                    session.setAttribute("user", userService.getSellerByUserId(rightUser.getId()));
                    break;
                case "Processor":
                    session.setAttribute("user", userService.getProcessorByUserId(rightUser.getId()));
                    break;
                case "Producer":
                   session.setAttribute("user", userService.getProducerByUserId(rightUser.getId()));
                    break;
                case "HoReCa":
                    session.setAttribute("user", userService.getHoReCaByUserId(rightUser.getId()));
                    break;
                default:
                    System.out.println("User type not recognized.");
                    break;
            }

            return "redirect:/userHomePage";
        } else {
            model.addAttribute("error", true);
            return "signIn";
        }
    }

}
