package hr.algebra.tracefood.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/userHomePage")
    public String userHomePage() {
        return "userHomePage";
    }

    @GetMapping("/homePage")
    public String homePage() {
        return "homePage";
    }

    @GetMapping("/")
    public String index() {
        return "homePage";
    }


}
