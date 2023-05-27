package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Consumer;
import hr.algebra.tracefood.backend.classicdb.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    public ConsumerService consumerService;

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("{id}")
    public Consumer getById(@PathVariable final Long id) {
        return consumerService.getById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Class test with id "+id+" doesn't exist."));
    }

    @GetMapping
    public List<Consumer> getAll() {
        return consumerService.getAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Consumer create(@RequestBody Consumer newConsumer) {
        return consumerService.create(newConsumer);
    }

    @PutMapping
    public Consumer update(@RequestBody Consumer updatedConsumer) {
        return consumerService.update(updatedConsumer);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable final Long id) {
        consumerService.deleteById(id);
    }

}
