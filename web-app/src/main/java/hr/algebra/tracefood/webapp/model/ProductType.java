package hr.algebra.tracefood.webapp.model;

public enum ProductType {
    BAKED_GOOD("Baked Good"),
    CEREAL("Cereal"),
    DAIRY_PRODUCT("Dairy Product"),
    FUNGUS("Fungus"),
    NUTS_AND_SEEDS("Nuts and Seeds"),
    LEGUME("Legume"),
    MEAT("Meat"),
    FRUIT("Fruit");

    private String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}