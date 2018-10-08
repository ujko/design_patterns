package structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new GreenColor());
        Shape pen = new Pentagon(new RedColor());
        tri.apllyColor();
        pen.apllyColor();
    }
}
