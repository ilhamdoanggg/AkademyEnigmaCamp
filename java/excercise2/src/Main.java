import com.enigma.model.Circle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Circle> circles = new HashSet<>();
        circles.add(new Circle(9));
        circles.add(new Circle(5));
        circles.add(new Circle(4));
        circles.add(new Circle(10));
        circles.add(new Circle(10));
        circles.add(new Circle(10));

        Iterator<Circle>iterator=circles.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().print());
        }

    }
}

//        Circle circle = new Circle();
       /* ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(1));
        circles.add(new Circle(3));
        circles.add(new Circle(5));
        circles.add(new Circle(5));
        circles.add(new Circle(5));
        circles.add(new Circle(5));

        System.out.println(circles.size());
        Circle yangDicari = new Circle(5);
        System.out.println("ada ?" + circles.contains(yangDicari));
*/
        /*Iterator<Circle>iterator=circles.iterator();
        while (iterator.hasNext()){
            Circle circle= iterator.next();
            System.out.println(circle.getRound());
        }
*/