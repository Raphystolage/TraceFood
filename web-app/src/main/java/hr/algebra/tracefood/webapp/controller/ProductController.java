package hr.algebra.tracefood.webapp.controller;

import hr.algebra.tracefood.webapp.model.Certification;
import hr.algebra.tracefood.webapp.model.Operation;
import hr.algebra.tracefood.webapp.model.Product;
import hr.algebra.tracefood.webapp.service.ProductService;
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
    ProductService productService;
/*
    @Autowired
    OperationService operationService;
*/

    @GetMapping("/informationAboutAProduct")
    public String informationAboutAProduct() {
        return "informationAboutAProduct";
    }

    @PostMapping("/informationAboutAProduct")
    public String searchForAProduct(Model model, @RequestParam("idProduct") Long idProduct) {
        /*
        Product product = productService.getById(idProduct);
        List<Operation> operations = new ArrayList<>();
        while(product.getParent().isPresent()) {
            operations.addAll(operationService.getByProductId(idProduct));
            product = product.getParent();
        };

         */
        return "informationAboutAProduct";
    }
}
