package creational.builder;

public class CargoTrainBuilder extends TrainBuider {
    @Override
    protected void composeTrain() {
        train = new Train();
        train.setTrainType(TrainType.CARGO);
        train.setName("Some train");
        train.setNumber(21);
    }

    @Override
    public Train build() {
        composeTrain();
        return train;
    }
}
