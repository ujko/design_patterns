package zadania.zadanie1;

public class Dolly implements IToy{
    private ToyType toyType;
    private String name;

    public Dolly(ToyType toyType, String name) {
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
        return "Dolly{" +
                "toyType=" + toyType +
                ", name='" + name + '\'' +
                '}';
    }
}
