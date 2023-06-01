package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.*;
import hr.algebra.tracefood.webapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static hr.algebra.tracefood.webapp.model.OperationDisplay.sortOperations;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductionService productionService;

    @Autowired
    private TransportService transportService;

    @Autowired
    private ProcessingService processingService;


    @GetMapping("/informationAboutAProduct")
    public String informationAboutAProduct() {
        return "informationAboutAProduct";
    }

    @GetMapping("/searchForAProduct")
    public String searchForAProduct() {
        return "searchForAProduct";
    }

    @PostMapping("/informationAboutAProduct")
    public String searchForAProduct(Model model, @RequestParam("productId") Long productId) {

        Product product = productService.getById(productId);
        List<OperationDisplay> operations = new ArrayList<>();

        List<Production> productions = productionService.getByCreatedProductId(productId);
        List<Processing> processes = processingService.getAllByOriginProductId(productId);
        List<Transport> transports = transportService.getAllByProductId(productId);

        operations.addAll(addProductOperations(processes, transports, productions));


        while(product.getParent() != null){
            product = product.getParent();
            processes = processingService.getAllByOriginProductId(product.getId());
            transports = transportService.getAllByProductId(product.getId());
            productions = productionService.getByCreatedProductId(productId);
            operations.addAll(addProductOperations(processes, transports, productions));
        }

        sortOperations(operations);
        model.addAttribute("operations", operations);

        return "informationAboutAProduct";
    }

    private List<OperationDisplay> addProductOperations(List<Processing> processes, List<Transport> transports, List<Production> productions) {
        List<OperationDisplay> operations = new ArrayList<>();

        for (Processing processing : processes) {
            operations.add(processingService.toOperationDisplay(processing));
        }

        for (Transport transport : transports) {
            operations.add(transportService.toOperationDisplay(transport));
        }

        for (Production production : productions) {
            operations.add(productionService.toOperationDisplay(production));
        }
        return operations;
    }


}
