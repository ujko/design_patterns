package zadania.zadanie2;

public class Square implements IShape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void countPaintForArea() {
        System.out.println("Ilość farby - pole kwadrat: " + (Math.pow(a,2)));
    }

    @Override
    public void countPaintForPerimeter() {
        System.out.println("Ilość farby - obwód kwadrat: " + (4 * a));
    }
}
