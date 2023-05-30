package hr.algebra.tracefood.webapp.model;

public enum ProcessorType {

    FLOURMILLER("Flour Miller"),
    MEATPROCESSOR("Meat Processor"),
    DAIRYPROCESSOR("Dairy Processor"),
    FISHPROCESSOR("Fish Processor"),
    FRUITANDVEGETABLEPROCESSOR("Fruit and Vegetable Processor"),
    COFFEEPROCESSOR("Coffee Processor"),
    SNACKFOODPROCESSOR("Snack Food Processor"),
    BEVERAGEPROCESSOR("Beverage Processor"),
    BAKERYPROCESSOR("Bakery Processor"),
    CONFECTIONERYPROCESSOR("Confectionery Processor");

    private final String displayName;

    private ProcessorType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
