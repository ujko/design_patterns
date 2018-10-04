package creational.factory;

public class FactoryExample {

    public static void main(String[] args) {
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER);
        Computer pc = ComputerFactory.getComputer(ComputerType.PC);
        System.out.println(server);
        System.out.println(pc);
    }
}
