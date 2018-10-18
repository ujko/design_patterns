package creational.builder.fluent;

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("2TB", "16GB")
                .setBluetoothEnabled(false)
                .setGraphicCardEnabled(true)
                .build();

        System.out.println(computer);
    }
}
