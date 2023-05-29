package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
/* import hr.algebra.tracefood.webapp.service.HoReCaService; */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SignUpController {

/*
    @Autowired
    public HoReCaService hoReCaService;
    public final List<HoReCa> hoReCas = hoReCaService.getAll();
*/

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

    public boolean userAlreadyExist(List<User> users, String emailAddress) {
        boolean signUpSuccessful = true;

        for (User user : users) {
            if (user.getEmailAddress().equals(emailAddress)) {
                signUpSuccessful = false;
            }
        }
        return signUpSuccessful;
    }

    /*
    @PostMapping("/signUpSeller")
    public String SignUpProcessorForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = userAlreadyExist(processors, emailAddress)

        if (signUpSuccessful) {
            Processor newProcessor = new Processor(null, companyName, companyAddress, type, emailAddress, type, password, null);
            processorService.create(newProcessor);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProcessor";
        }

    }

    @PostMapping("/signUpProcessor")
    public String SignUpProcessorForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = userAlreadyExist(producers, emailAddress)

        if (signUpSuccessful) {
            Processor newProcessor = new Processor(null, companyName, companyAddress, type, emailAddress, type, password, null);
            processorService.create(newProcessor);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProcessor";
        }

    }

    @PostMapping("/signUpProducer")
    public String SignUpProducerForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("companyAddress") String companyAddress,
                                    @RequestParam("type") String type,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = userAlreadyExist(sellers, emailAddress)


        if (signUpSuccessful) {
            Producer newProducer = new Producer(null, companyName, companyAddress, type, emailAddress, password, null);
            producerService.create(newProcessor);
            return "redirect:/userHomePage";

        } else {
            model.addAttribute("error", true);
            return "signUpProducer";
        }

    }

    @PostMapping("/signUpHoReCa")
    public String SignUpHoReCaForm(@RequestParam("companyName") String companyName,
                                    @RequestParam("emailAddress") String emailAddress,
                                    @RequestParam("password") String password, Model model) {

        boolean signUpSuccessful = userAlreadyExist(hoReCas, emailAddress)

        }
        if (signUpSuccessful) {
            HoReCa newHoReCa = new HoReCa(null, companyName, emailAddress, password, null);
            hoReCaService.create(newHoReCa);
            return "redirect:/userHomePage";
        } else {
            model.addAttribute("error", true);
            return "signUpHoReCa";
        }
    }

     */

}
