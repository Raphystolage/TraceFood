package hr.algebra.tracefood.backend.service;

import hr.algebra.tracefood.backend.model.ClassTest;
import hr.algebra.tracefood.backend.repository.ClassTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassTestService {

    @Autowired
    public ClassTestRepository classTestRepository;

    public List<ClassTest> getAll() {
        return classTestRepository.findAll();
    }

    public Optional<ClassTest> get(Long id) {
        return classTestRepository.findById(id);
    }
}
