package hr.algebra.tracefood.webapp.model;

import java.time.LocalDate;
import java.util.Map;

public class OperationDisplay {

    private LocalDate date;
    private OperationType type;
    private Map<String, String> attributs;

    public OperationDisplay(LocalDate date, OperationType type, Map<String, String> attributs) {
        this.date = date;
        this.type = type;
        this.attributs = attributs;
    }

    public LocalDate getDate() {
        return date;
    }
    public OperationType getType() {
        return type;
    }
    public Map<String, String> getAttributs() {
        return attributs;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setType(OperationType type) {
        this.type = type;
    }
    public void setAttributs(Map<String, String> attributs) {
        this.attributs = attributs;
    }

}
