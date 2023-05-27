package hr.algebra.tracefood.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class accountController {

    @GetMapping("/accountInformation")
    public String accountInformation() {
        return "accountInformation";
    }

}
