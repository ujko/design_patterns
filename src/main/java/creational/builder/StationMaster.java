package creational.builder;

public class StationMaster {
    private TrainBuider trainBuider;

    public StationMaster(TrainBuider trainBuider) {
        this.trainBuider = trainBuider;
    }

    public void setTrainBuider(TrainBuider trainBuider) {
        this.trainBuider = trainBuider;
    }

    public Train getTrain() {
        return trainBuider.build();
    }
}
