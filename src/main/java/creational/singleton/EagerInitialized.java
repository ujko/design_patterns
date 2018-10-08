package creational.singleton;

public class EagerInitialized {
    private static final EagerInitialized INSTANCE = new EagerInitialized();

    private EagerInitialized(){
    }

    public static EagerInitialized getInstance() {
        return INSTANCE;
    }

}
