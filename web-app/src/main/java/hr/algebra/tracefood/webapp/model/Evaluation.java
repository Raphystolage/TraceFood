package hr.algebra.tracefood.webapp.model;

import java.util.Optional;

public class Evaluation {

    private Long id;
    private Consumer author;
    private Food food;
    private int rate;
    private Optional<String> comment;

    public Evaluation() {}
    public Evaluation(Long id, Consumer author, Food food, int rate, Optional<String> comment) {
        this.id = id;
        this.author = author;
        this.food = food;
        this.rate = rate;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }
    public Consumer getAuthor() {
        return author;
    }
    public Food getFood() {
        return food;
    }
    public int getRate() {
        return rate;
    }
    public Optional<String> getComment() {
        return comment;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setAuthor(Consumer author) {
        this.author = author;
    }
    public void setFood(Food food) {
        this.food = food;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public void setComment(Optional<String> comment) {
        this.comment = comment;
    }

}
