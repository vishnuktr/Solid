import java.util.List;

public class Pictures implements Shape {
    private List<Shape> shapes;


    public Pictures(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        System.out.println("Drawing picture!");
        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}
