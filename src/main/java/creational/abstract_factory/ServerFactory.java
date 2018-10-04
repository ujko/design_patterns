package creational.abstract_factory;

public class ServerFactory implements ComputerAbstractFactory {
    String name;
    String cpu;
    String ram;

    public ServerFactory(String name, String cpu, String ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new Server(name, cpu, ram);
    }
}
