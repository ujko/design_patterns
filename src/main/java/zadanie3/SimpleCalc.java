package zadanie3;

public class SimpleCalc implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtr(int a, int b) {
        return a - b;
    }

    @Override
    public double div(int a, int b) {
        return a / b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
