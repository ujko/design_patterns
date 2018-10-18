package creational.builder;

public abstract class TrainBuider {
    protected Train train;

    protected abstract void composeTrain();

    public Train build() {
        return train;
    }
}
