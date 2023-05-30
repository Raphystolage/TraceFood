package hr.algebra.tracefood.webapp.model;

import hr.algebra.tracefood.webapp.service.FoodService;

public class Product {

    private Long id;
    private Product parent;
    private Long foodId;
    private String name;
    private ProductType type;

    public Product() {}
    public Product(Product parent, Food food, String name, ProductType type) {
        this.id = null;
        this.parent = parent;
        this.foodId = food==null ? null : food.getId();
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public Product getParent() {
        return parent;
    }
    public Food getFood() {
        return foodId==null ? null : (new FoodService()).getById(foodId);
    }
    public Long getFoodId() {
        return foodId;
    }
    public String getName() {
        return name;
    }
    public ProductType getType() {
        return type;
    }

}
