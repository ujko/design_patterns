package zadanie2;

public class TestExc2 {

    public static void main(String[] args) {
        IShape cir1 = new Circle(12);
        IShape cir2 = new Circle(23);
        IShape square = new Square(44);
        PaintCounting paintCounting = new PaintCounting();
        paintCounting.add(cir1);
        paintCounting.add(cir2);
        paintCounting.add(square);

        paintCounting.countPaintForArea();
        paintCounting.countPaintForPerimeter();
    }
}
