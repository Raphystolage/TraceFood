package hr.algebra.tracefood.backend.classicdb.service;

import hr.algebra.tracefood.backend.classicdb.model.Food;
import hr.algebra.tracefood.backend.classicdb.repository.FoodRepository;
import org.springframework.stereotype.Service;

@Service
public class FoodService extends AbstractClassicDBStorableService<Food> {
    public FoodService(FoodRepository repository) {
        super(repository);
    }
}
