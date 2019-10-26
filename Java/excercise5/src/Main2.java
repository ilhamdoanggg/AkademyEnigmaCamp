import com.enigma.model.Circle;

import java.util.HashSet;
import java.util.Set;

/**
 * |--------------------------------------------------------------------------
 * | 9/17/2019 10:13 PM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Main2 {
    public static void main(String[] args) {
        System.out.println("=====================================");

        Set<Circle> circles = new HashSet<>();

        circles.add(new Circle(10));
        circles.add(new Circle(5));
        circles.add(new Circle(1));
        circles.add(new Circle(1));
        circles.add(new Circle(1));
        circles.add(new Circle(3));
        circles.add(new Circle(4));

        for (Circle nilai2:circles) {
            System.out.println(nilai2.getRound());
        }
        System.out.println("Size 2 :"+circles.size());
    }
}
