package creational.factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType computerType) {
        switch (computerType){
            case PC:
                return new PC("Computer PC", "I5", "16GB");
            case SERVER:
                return new Server("IBM", "I7", "64GB");
        }
        return null;
    }
}
