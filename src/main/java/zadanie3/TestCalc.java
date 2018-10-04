package zadanie3;

public class TestCalc {

    public static void main(String[] args) {
        Calculator calculator = new SimpleCalc();
        System.out.println(calculator.add(5, 3));
        Calculator profCalc = new ProfCalc(new SimpleCalc());
        System.out.println(profCalc.div(4,2));
    }
}
