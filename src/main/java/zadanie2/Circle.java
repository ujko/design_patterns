package zadanie2;

public class Circle implements IShape {
    private int a;

    public Circle(int a) {
        this.a = a;
    }

    @Override
    public void countPaintForArea() {
        System.out.println("Ilość farby - pole koło: " + (Math.PI * Math.pow(a, 2)));
    }

    @Override
    public void countPaintForPerimeter() {
        System.out.println("Ilość farby obwód - koło: " + (2 * Math.PI * a));
    }
}
