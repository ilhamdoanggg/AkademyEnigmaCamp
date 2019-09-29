import com.enigma.model.Circle;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

//        Circle circle = new Circle();
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(1));
        circles.add(new Circle(3));
        circles.add(new Circle(5));
        circles.add(new Circle(5));
        circles.add(new Circle(5));
        circles.add(new Circle(5));

        System.out.println(circles.size());
        Circle yangDicari = new Circle(2);
        System.out.println();

        Iterator<Circle>iterator=circles.iterator();
        while (iterator.hasNext()){
            Circle circle= iterator.next();
            System.out.println(circle.getRound());
        }

    }
}
