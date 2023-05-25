package hr.algebra.tracefood.webapp.model;

import org.springframework.stereotype.Component;

@Component
public class ClassTest {

    private Long arg1;
    private String arg2;

    public ClassTest() {}
    public ClassTest(Long arg1, String arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public Long getArg1() {
        return arg1;
    }
    public String getArg2() {
        return arg2;
    }

    public void setArg1(Long arg1) {
        this.arg1 = arg1;
    }
    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

}
