package behavioral.template;

public abstract class HouseTemplate {
    public void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House has been built");
    }

    private void buildWindows() {
        System.out.println("Build windows");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building Foundation");
    }
}
