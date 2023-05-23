package hr.algebra.tracefood.backend.controller;

import hr.algebra.tracefood.backend.model.ClassTest;
import hr.algebra.tracefood.backend.service.ClassTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("classtest")
public class ClassTestController {

    @Autowired
    public ClassTestService classTestService;

    @GetMapping("{id}")
    public ClassTest get(@PathVariable final Long id) {
        return classTestService.get(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Class test with id "+id+" doesn't exist."));
    }
}
