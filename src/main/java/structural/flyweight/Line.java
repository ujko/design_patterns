package structural.flyweight;

import java.awt.*;

public class Line implements Shape {
    public Line() {
        System.out.println("Create Line object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}
