package creational.singleton;

public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock() {}

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton");
        }

    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
