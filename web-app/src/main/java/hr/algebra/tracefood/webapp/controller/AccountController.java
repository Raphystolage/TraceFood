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


 */
    @GetMapping("/accountInformation")
    public String accountInformation(Model model) {
/*
        HttpSession session = request.getSession();
        User user = session.getAttribute("user").getUser();
        model.addAttribute("companyName", user.getCompanyName());
        model.addAttribute("companyAddress", user.getEmailAddress());
        model.addAttribute("passwordLength", user.getPassword().length());
        model.addAttribute("certifications", user.getGiveableCertifications());
        model.addAttribute("allCertifications", new CertificationService().getAll());

 */
        return "accountInformation";
    }
/*
    @DeleteMapping("/deleteAccount")
    public String deleteAccount(Model model) {

        HttpSession session = request.getSession();

        switch (session.getAttribute("user").getClass().getName()) {
            case "Seller":
                Long sellerId = session.getAttribute("user").getId();
                SellerService sellerService = new SellerService();
                sellerService.deleteById(sellerId);
                break;
            case "Processor":
                Long processorId = session.getAttribute("user").getId();
                ProcessorService processorService = new ProcessorService();
                processorService.deleteById(processorId);
                break;
            case "Producer":
                Long producerId = session.getAttribute("user").getId();
                ProducerService producerService = new producerService();
                producerService.deleteById(producerId);
                break;
            case "HoReCa":
                Long hoReCaId = session.getAttribute("user").getId();
                HoReCaService hoReCaService = new SellerService();
                hoReCaService.deleteById(hoReCaId);
                break;
            default:
                System.out.println("User type not recognized.");
                break;
        }

        return "accountInformation";
    }
 */

    @GetMapping("/history")
    public String history(Model model) {
/*
        HttpSession session = request.getSession();

        TransportService transportService = new TransportService();
        ProcessingService processingService = new ProcessingService();
        ProductionService productionService = new ProductionService();

        List<Transport> transports = null;
        List<Processing> process = null;
        List<Production> productions = null;

        switch (session.getAttribute("user").getClass().getName()) {

            case "Processor":
                processingService.getByProcessorId(session.getAttribute("user").getId());
                break;
            case "Producer":
                productionService.getByProducerId(session.getAttribute("user").getId());
                break;
            default:
                break;
        }

        transportService.getBySenderId(session.getAttribute("user").getUser().getId());

        model.addAttribute(transports);
        model.addAttribute(process);
        model.addAttribute(productions);
*/
        return "informationAboutAProduct";
    }

    @DeleteMapping("/addNewCertification")
    public String addNewCertification(Model model, @RequestParam("newCertification") CertificationType newCertification) {
        /*HttpSession session = request.getSession();
        List<CertificationType> giveableCertifications = session.getAttribute("user").getGiveableCertification();
        giveableCertifications.add(newCertification);
        session.getAttribute("user").setGiveableCertification(giveableCertifications);*/
        return "accountInformation";
    }

}
