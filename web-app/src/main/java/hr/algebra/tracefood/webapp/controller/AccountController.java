package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
/*
    @Autowired
    private HttpServletRequest request;

    private User getSessionUser(){
        HttpSession session = request.getSession();
        return (User) session.getAttribute("user");
    }

    @Autowired
    private Operation Service operationService;

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
        User user = getSessionUser();
        Long userId = user.getId();
        switch (user.getClass().getSimpleName()) {
            case "Seller":
                SellerService sellerService = new SellerService();
                sellerService.deleteById(userId);
                break;
            case "Processor":
                ProcessorService processorService = new ProcessorService();
                processorService.deleteById(userId);
                break;
            case "Producer":
                ProducerService producerService = new ProducerService();
                producerService.deleteById(userId);
                break;
            case "HoReCa":
                HoReCaService HoReCa hoReCaService = new HoReCaService();
                horecaService.deleteById(userId);
                break;
            default:
                System.out.println("User type not recognized.");
                break;
        }*/
        return "accountInformation";
    }

    @GetMapping("/history")
    public String history(Model model) {
        /*
        User user = getSessionUser();
        Long userId = user.getId();
        List<Sell> sells = SellService.getBySellerId(userId);
        List<Transport> transports = TransportService.getBySenderId();
        List<Processing> processes = ProcessingService.getByProcessorId();
        List<Production> productions = ProductionService.getByProductionId();
        model.addAttribute(sells);
        model.addAttribute(transports);
        model.addAttribute(processes);
        model.addAttribute(productions);
         */
        return "informationAboutAProduct";
    }

}
