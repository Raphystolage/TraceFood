package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.Food;

import org.springframework.stereotype.Service;

@Service
public class FoodService extends AbstractClassicDBStorableService<Food> {

    public FoodService() {
        super("/food", Food.class);
    }

}
