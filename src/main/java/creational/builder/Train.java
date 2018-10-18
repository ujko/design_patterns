package creational.builder;

public class Train {
    private int number;
    private String name;
    private TrainType trainType;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", trainType=" + trainType +
                '}';
    }
}
