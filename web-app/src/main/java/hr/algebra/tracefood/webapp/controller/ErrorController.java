package hr.algebra.tracefood.webapp.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorController {

    @GetMapping("/error")
    public String error() {
        return "error";
    }


    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex) {
        // Loggez l'erreur ou faites d'autres traitements nécessaires

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("errorMessage", ex.getMessage());
        return modelAndView;
    }
}
