package creational.factory;

public abstract class Computer {
    String name;
    String cpu;
    String ram;

    public Computer(String name, String cpu, String ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    String getName() {
        return name;
    }

    String getCpu() {
        return cpu;
    }

    String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" + " Name: " + getName() + ", CPU: " + getCpu() + ", Ram: " + getRam() + " }";
    }
}
