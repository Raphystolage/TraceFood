package hr.algebra.tracefood.backend.blockchaindb.service;

import hr.algebra.tracefood.backend.AbstractStorableService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractBlockchainDBStorableService<T> extends AbstractStorableService<T> {

    public AbstractBlockchainDBStorableService(JpaRepository<T, Long> repository) {
        super(repository);
    }

    @Override
    public T update(T updatedStorable) {
        return null;
    }
    @Override
    public void deleteById(Long id) {}

}
