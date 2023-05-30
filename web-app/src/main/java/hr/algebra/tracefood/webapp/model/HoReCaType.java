package hr.algebra.tracefood.webapp.model;

public enum HoReCaType {

    HOTEL("Hotel"),
    RESTAURANT("Restaurant"),
    CAFE("Cafe");

    private final String displayName;

    private HoReCaType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
