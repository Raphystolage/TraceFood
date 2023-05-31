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

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/informationAboutAProduct")
    public String informationAboutAProduct() {
        return "informationAboutAProduct";
    }

    @GetMapping("/searchForAProduct")
    public String searchForAProduct() {
        return "searchForAProduct";
    }

    /*
    @PostMapping("/informationAboutAProduct")
    public String searchForAProduct(Model model, @RequestParam("productId") Long productId) {

        Product product = productService.getById(productId);

        ProductionService productionService = new ProductionService();
        ProcessingService processingService = new ProcessingService();
        TransportService transportService = new TransportService();

        List<Product> productions = new ArrayList<>();
        List<Processing> process = new ArrayList<>();
        List<Transport> transports = new ArrayList<>();


        while(product.getParent().isPresent()) {
            productions.addAll(productionService.getAllByCreatedProductId(productId));
            process.addAll(processingService.getAllByOriginProductId(productId));
            transports.addAll(transportService.getAllByProductId(productId));
            product = product.getParent();
        }

        model.addAttribute("productions", productions);
        model.addAttribute("process", process);
        model.addAttribute("transports", transports);

        return "informationAboutAProduct";
    }

     */
}
