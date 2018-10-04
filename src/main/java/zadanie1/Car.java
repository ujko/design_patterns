package zadanie1;

public class Car implements IToy {
    private ToyType toyType;
    private String name;

    public Car(ToyType toyType, String name) {
        this.toyType = toyType;
        this.name = name;
    }

    public ToyType getToyType() {
        return toyType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "toyType=" + toyType +
                ", name='" + name + '\'' +
                '}';
    }
}
