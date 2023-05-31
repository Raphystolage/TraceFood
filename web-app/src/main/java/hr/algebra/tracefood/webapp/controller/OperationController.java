package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.ProductionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class OperationController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/addAnOperation")
    public String addAnOperation() {
        return "addAnOperation";
    }

    @GetMapping("/addAProduction")
    public String addAProduction() {
        return "addAProduction";
    }

    @GetMapping("/addAProcessing")
    public String addAProcessing() {
        return "addAProcessing";
    }

    @GetMapping("/addATransport")
    public String addATransport() {
        return "addATransport";
    }

    @PostMapping("/addAProduction")
    public String addANewProduction(@RequestParam("productName") String productName,
                                    @RequestParam("description") String description,
                                    @RequestParam("dateOfCreation") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate date,
                                    @RequestParam("productType") String type,
                                    @RequestParam("isFinishedProduct") boolean isFinishedProduct) {
        HttpSession session = request.getSession();
        Producer producer = (Producer) session.getAttribute("user");
        ProductionService productionService = new ProductionService();
        productionService.createProductionOptimized(description, producer, date, productName, ProductType.valueOf(type), isFinishedProduct);
        return "userHomePage";
    }


}
