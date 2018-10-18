package creational.builder;

public class BuilderTest {

    public static void main(String[] args) {

        StationMaster stationMaster = new StationMaster(new CargoTrainBuilder());
        Train train = stationMaster.getTrain();
        System.out.println(train);
    }
}
