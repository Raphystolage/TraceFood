package hr.algebra.tracefood.backend.classicdb.controller;

import hr.algebra.tracefood.backend.classicdb.model.Food;
import hr.algebra.tracefood.backend.classicdb.service.FoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController extends AbstractClassicDBStorableController<Food> {

    public FoodController(FoodService service) {
        super(service);
    }

}
