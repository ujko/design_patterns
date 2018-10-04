package creational.abstract_factory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("Dell", "I3", "8GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("IBM", "I7", "16GB"));
        System.out.println(pc);
        System.out.println(server);
    }
}
