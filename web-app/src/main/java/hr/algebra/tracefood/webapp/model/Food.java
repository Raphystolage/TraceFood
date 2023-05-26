package hr.algebra.tracefood.webapp.model;

import java.util.List;

public class Food {

    private Long id;
    private Product product;
    private List<Evaluation> evaluations;

    public Food() {}
    public Food(Long id, Product product, List<Evaluation> evaluations) {
        this.id = id;
        this.product = product;
        this.evaluations = evaluations;
    }

    public Long getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }
    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

}
