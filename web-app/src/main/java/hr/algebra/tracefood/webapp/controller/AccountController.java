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

import static hr.algebra.tracefood.webapp.model.OperationDisplay.sortOperations;

@Controller
public class AccountController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductionService productionService;

    @Autowired
    private TransportService transportService;

    @Autowired
    private ProcessingService processingService;


    @GetMapping("/accountInformation")
    public String accountInformation(Model model) {

        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");
        User user = new User();
        String userType = (String) session.getAttribute("userType");
        if (userType != null) {
            switch (userType) {
                case "Seller":
                    Seller seller = (Seller) userObject;
                    user = seller.getUser();
                    model.addAttribute("companyName", user.getCompanyName());
                    model.addAttribute("companyAddress", user.getEmailAddress());
                    model.addAttribute("passwordLength", user.getPassword().length());
                    break;
                case "Producer":
                    Producer producer = (Producer) userObject;
                    user = producer.getUser();
                    model.addAttribute("companyName", user.getCompanyName());
                    model.addAttribute("companyAddress", user.getEmailAddress());
                    break;
                case "HoReCa":
                    HoReCa hoReCa = (HoReCa) userObject;
                    user = hoReCa.getUser();
                    model.addAttribute("companyName", user.getCompanyName());
                    model.addAttribute("companyAddress", user.getEmailAddress());
                    break;
                default:
                    Processor processor = (Processor) userObject;
                    user=processor.getUser();
                    model.addAttribute("companyName", user.getCompanyName());
                    model.addAttribute("companyAddress", user.getEmailAddress());
                    break;
            }
        }

        //model.addAttribute("allCertifications", new CertificationService().getAll());

        return "accountInformation";
    }

    @GetMapping("/history")

    public String history(Model model) {

        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");
        User user = new User();
        String userType = (String) session.getAttribute("userType");

        TransportService transportService = new TransportService();
        ProcessingService processingService = new ProcessingService();
        ProductionService productionService = new ProductionService();
        List<OperationDisplay> operations = new ArrayList();
        List<Transport> transports = new ArrayList<>();
        if (userType != null) {
            switch (userType) {
                case "Processor":
                    Processor processor = (Processor) userObject;
                    List<Processing> processes = processingService.getByProcessorId(processor.getId());
                    transports = transportService.getBySenderId(processor.getId());
                    for (Processing processing : processes){
                        operations.add(processingService.toOperationDisplay(processing));
                    }
                    break;
                case "Producer":
                    Producer producer = (Producer) userObject;
                    List<Production> productions = productionService.getAllByProducerId(producer.getId());
                    for (Production production : productions){
                        operations.add(productionService.toOperationDisplay(production));
                    }
                    transportService.getBySenderId(producer.getId());
                    break;
                case "Seller":
                    Seller seller = (Seller) userObject;
                    transports = transportService.getBySenderId(seller.getId());
                    break;
                default:
                    HoReCa hoReCa = (HoReCa) userObject;
                    transports = transportService.getBySenderId(hoReCa.getId());
                    break;
            }
        }

        for (Transport transport : transports){
            operations.add(transportService.toOperationDisplay(transport));
        }

        sortOperations(operations);
        model.addAttribute("operations", operations);
        return "history";
    }

    @PostMapping("/addNewCertification")
    public String addNewCertification(Model model, @RequestParam("newCertification") CertificationType newCertification) {
        /*HttpSession session = request.getSession();
        List<CertificationType> giveableCertifications = session.getAttribute("user").getGiveableCertification();
        giveableCertifications.add(newCertification);
        session.getAttribute("user").setGiveableCertification(giveableCertifications);*/
        return "redirect:/accountInformation";
    }

}
