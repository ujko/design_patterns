package zadanie2;

import java.util.ArrayList;
import java.util.List;

public class PaintCounting implements IShape {
    private List<IShape> shapes = new ArrayList<>();

    @Override
    public void countPaintForArea() {
        for (IShape s : shapes) {
            s.countPaintForArea();
        }
    }

    @Override
    public void countPaintForPerimeter() {
        for (IShape s : shapes) {
            s.countPaintForPerimeter();
        }
    }

    public void add(IShape shape) {
        shapes.add(shape);
    }

    public void remove(IShape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        shapes.clear();
    }
}
