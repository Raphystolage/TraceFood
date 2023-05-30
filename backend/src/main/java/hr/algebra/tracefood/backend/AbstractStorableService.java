package hr.algebra.tracefood.backend;

import hr.algebra.tracefood.backend.blockchaindb.model.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class AbstractStorableService<T> {

    protected JpaRepository<T, Long> repository;

    public AbstractStorableService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public T create(T newStorable) {
        return repository.save(newStorable);
    }

    public Optional<T> getById(Long id) {
        return repository.findById(id);
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public abstract T update(T updatedStorable);

    public abstract void deleteById(Long id);

}
