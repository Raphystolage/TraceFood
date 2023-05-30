package hr.algebra.tracefood.webapp.model;

public class Evaluation {

    private Long id;
    private Consumer author;
    private Food food;
    private int rate;
    private String comment;

    public Evaluation() {}
    public Evaluation(Consumer author, Food food, int rate, String comment) {
        this.id = null;
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
    public String getComment() {
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
    public void setComment(String comment) {
        this.comment = comment;
    }

}
