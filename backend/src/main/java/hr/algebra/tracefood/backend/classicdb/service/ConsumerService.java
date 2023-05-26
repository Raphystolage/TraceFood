package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Consumer;
import hr.algebra.tracefood.backend.classicdb.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumerService {

    @Autowired
    public ConsumerRepository consumerRepository;

    public Optional<Consumer> getById(Long id) {
        return consumerRepository.findById(id);
    }
    public List<Consumer> getAll() {
        return consumerRepository.findAll();
    }

    public Consumer create(Consumer newConsumer) {
        return consumerRepository.save(newConsumer);
    }

    public Consumer update(Consumer updatedConsumer) {
        return consumerRepository.save(updatedConsumer);
    }

    public void deleteById(Long id) {
        consumerRepository.deleteById(id);
    }

}
