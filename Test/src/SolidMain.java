import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolidMain {

    public static void main(String[] args) {

        System.out.println("Test git commit Abc");

        Canvas canvas = new Canvas();


        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        System.out.println("hello");

        List<Shape> shapes= Arrays.asList(square,circle,triangle);
        Pictures pictures= new Pictures(shapes);

        canvas.draw(pictures);
//        canvas.draw(circle);
//        canvas.draw(triangle);
//        canvas.draw(square);


    }


}
