package zadania.zadanie1;

public class Excercise1 {

    public static void main(String[] args) {
        IToy barbie = ToyFactory.getToy(ToyType.DOLLY, "Barbie");
        IToy steeringCar = ToyFactory.getToy(ToyType.CAR, "Steering car");

        System.out.println(barbie);
        System.out.println(steeringCar);
    }
}
