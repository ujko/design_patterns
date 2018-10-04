package structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxuryCar.assemble();
    }
}
