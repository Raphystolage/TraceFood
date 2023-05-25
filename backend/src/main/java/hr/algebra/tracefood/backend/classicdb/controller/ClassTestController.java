package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.ClassTest;
import hr.algebra.tracefood.backend.classicdb.service.ClassTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("classTest")
public class ClassTestController {

    @Autowired
    public ClassTestService classTestService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("{id}")
    public ClassTest getById(@PathVariable final Long id) {
        return classTestService.getById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Class test with id "+id+" doesn't exist."));
    }

    @GetMapping
    public List<ClassTest> getAll() {
        return classTestService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ClassTest create(@RequestBody ClassTest newClassTest) {
        return classTestService.create(newClassTest);
    }

    @PutMapping
    public ClassTest update(@RequestBody ClassTest updatedClassTest) {
        return classTestService.update(updatedClassTest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable final Long id) {
        classTestService.deleteById(id);
    }

}
