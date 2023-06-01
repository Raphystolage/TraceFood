package hr.algebra.tracefood.webapp.model;

public enum OperationType {
    PRODUCTION,
    TRANSPORT,
    PROCESSING;

    @Override
    public String toString() {
        switch (this) {
            case PRODUCTION:
                return "Production";
            case TRANSPORT:
                return "Transport";
            case PROCESSING:
                return "Processing";
            default:
                return "Unknown";
        }
    }
}
