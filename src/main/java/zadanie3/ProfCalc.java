package zadanie3;

public class ProfCalc extends SimpleCalc {
    Calculator calculator;

    public ProfCalc(Calculator calculator) {
        this.calculator = calculator;
    }

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public double sqrt(int a) {
        return Math.sqrt(a);
    }
}
//Łukasz Mertyn