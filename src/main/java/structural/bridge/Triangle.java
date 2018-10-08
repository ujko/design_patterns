package structural.bridge;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void apllyColor() {
        System.out.print("Triangle filled with color - ");
        color.applyColor();
    }
}
