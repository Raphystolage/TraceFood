package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.User;
import hr.algebra.tracefood.webapp.service.ProcessorService;
import hr.algebra.tracefood.webapp.service.ProducerService;
import hr.algebra.tracefood.webapp.service.SellerService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class accountController {
/*
    @Autowired
    private HttpServletRequest request;
    HttpSession session = request.getSession();
    User user = (User) model.getAttribute("user");
*/
    @GetMapping("/accountInformation")
    public String accountInformation(Model model) {

        /*
        model.addAttribute("companyName", user.getCompanyName());
        model.addAttribute("companyAddress", user.getEmailAddress());
        model.addAttribute("passwordLength",user.getPassword().length());
        */
        return "accountInformation";
    }

    @DeleteMapping("/deleteAccount")
    public String deleteAccount(Model model) {
        /*
        User user=null;
        switch (user.getClass().getSimpleName()) {
            case "Seller":
                SellerService sellerService = new SellerService();
                sellerService.deleteById(user.getId());
                break;
            case "Processor":
                ProcessorService processorService = new ProcessorService();
                processorService.deleteById(user.getId());
                break;
            case "Producer":
                ProducerService producerService = new ProducerService();
                producerService.deleteById(user.getId());
                break;
            case "HoReCa":
                HoReCaService HoReCa hoReCaService = new HoReCaService();
                horecaService.deleteById(user.getId());
                break;
            default:
                System.out.println("User type not recognized.");
                break;
        }*/
        return "accountInformation";
    }

}
