package structural.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("This is a bassic car");
    }
}
