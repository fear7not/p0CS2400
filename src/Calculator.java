public class Calculator {
    private double member;

    public Calculator() {
        member = 0.0;
    }

    public void add(double val) {
        member = member + val;
    }
    public void subtract(double val) {
        member = member - val;
    }
    public void multiply(double val) {
        member = member * val;
    }
    public void divide(double val) {
        member = member / val;
    }

    public void clear() {
        member = 0.0;
    }

    public double getValue() {
        return member;
    }
}
