package hr.algebra.tracefood.webapp.model;

public enum SellerType {

    RETAILER("Retailer"),
    WHOLESAILER("Wholesaler");

    private final String displayName;

    private SellerType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}