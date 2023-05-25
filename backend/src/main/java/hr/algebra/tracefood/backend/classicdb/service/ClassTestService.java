package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.repository.ClassTestRepository;
import hr.algebra.tracefood.backend.classicdb.model.ClassTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassTestService {

    @Autowired
    public ClassTestRepository classTestRepository;

    public Optional<ClassTest> getById(Long id) {
        return classTestRepository.findById(id);
    }
    public List<ClassTest> getAll() {
        return classTestRepository.findAll();
    }

    public ClassTest create(ClassTest newClassTest) {
        return classTestRepository.save(newClassTest);
    }

    public ClassTest update(ClassTest updatedClassTest) {
        return classTestRepository.save(updatedClassTest);
    }

    public void deleteById(Long id) {
        classTestRepository.deleteById(id);
    }

}
