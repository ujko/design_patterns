package creational.singleton;

public class MethodInitialized {
    private static MethodInitialized instance;

    private MethodInitialized() {
    }

    public static MethodInitialized getInstance() {
        if (instance == null) {
            instance = new MethodInitialized();
        }
        return instance;
    }
}
