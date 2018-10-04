package creational.abstract_factory;

public class PCFactory implements ComputerAbstractFactory {
    String name;
    String cpu;
    String ram;

    public PCFactory(String name, String cpu, String ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(name, cpu, ram);
    }
}
