package zadanie1;

public class ToyFactory {

    private ToyFactory() {

    }

    public static IToy getToy(ToyType toyType, String name) {
        switch (toyType){
            case CAR:
                return new Car(toyType, name);
            case DOLLY:
                return new Dolly(toyType, name);
        }
        return null;
    }
}
