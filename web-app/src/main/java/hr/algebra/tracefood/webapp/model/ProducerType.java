package hr.algebra.tracefood.webapp.model;

public enum ProducerType {

    FARMER("Farmer"),
    RANCHER("Rancher"),
    FISHERMAN("Fisherman"),
    DAIRYFARMER("Dairy Farmer"),
    VITICULTURIST("Viticulturist"),
    BEEKEEPER("Beekeeper"),
    COFFEEGROWER("Coffee Grower"),
    HERBANDSPICEFARMER("Herb and Spice Farmer");

    private final String displayName;

    private ProducerType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
