package behavioral.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build Glass walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build Glass Pillars");
    }
}
