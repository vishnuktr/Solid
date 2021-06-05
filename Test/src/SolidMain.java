import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolidMain {

    public static void main(String[] args) {

        Canvas canvas = new Canvas();


        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        List<Shape> shapes= Arrays.asList(square,circle,triangle);
        Pictures pictures= new Pictures(shapes);

        canvas.draw(pictures);
//        canvas.draw(circle);
//        canvas.draw(triangle);
//        canvas.draw(square);


    }


}
