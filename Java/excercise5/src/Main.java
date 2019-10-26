import com.enigma.model.Circle;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(1));
        circles.add(new Circle(3));
        circles.add(new Circle(1));
        circles.add(new Circle(1));
        circles.add(new Circle(10));
        circles.add(new Circle(3));

        System.out.println(circles.size());
        Circle yangDiCari = new Circle(2);
        System.out.println();

        Iterator<Circle> iterator=circles.iterator();

        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getRound());
            if (circle.equals(yangDiCari)) {
                iterator.remove();
            }
        }
        System.out.println("=======");
        System.out.println(circles.size());
        System.out.println("========");
        iterator = circles.iterator();
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println(circle.getRound());
        }
    }
}
