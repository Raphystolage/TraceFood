package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.AbstractStorableController;
import hr.algebra.tracefood.backend.classicdb.service.AbstractClassicDBStorableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public abstract class AbstractClassicDBStorableController<T> extends AbstractStorableController<T> {

    public AbstractClassicDBStorableController(AbstractClassicDBStorableService<T> service) {
        super(service);
    }

    @PutMapping
    public T update(@RequestBody T updatedClassicDBStorable) {
        return service.update(updatedClassicDBStorable);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
