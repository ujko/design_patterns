package zadanie3;

public class CalcDecorator extends SimpleCalc {
    private Calculator calculator;

    public CalcDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public int subtr(int a, int b) {
        return super.subtr(a, b);
    }

    @Override
    public double div(int a, int b) {
        return super.div(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return super.multiply(a, b);
    }
}
