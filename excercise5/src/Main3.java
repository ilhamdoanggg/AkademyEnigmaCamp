import java.util.HashSet;
import java.util.Set;

/**
 * |--------------------------------------------------------------------------
 * | 9/17/2019 10:16 PM
 * |--------------------------------------------------------------------------
 * |This file add from Project Collection
 * |@author Ilhamdoanggg hanya manusia
 * |
 **/
public class Main3 {
    public static void main(String[] args) {

        System.out.println("==========Ascending sorting==========");

        Set<Integer> circleSet = new HashSet<>();

        circleSet.add(12);
        circleSet.add(10);
        circleSet.add(2);
        circleSet.add(3);
        circleSet.add(2);
        circleSet.add(2);
        circleSet.add(1);
        circleSet.add(1);
        circleSet.add(4);
        circleSet.add(6);
        circleSet.add(1);

        for (Integer nilai : circleSet) {
            System.out.println(nilai);
        }
        System.out.println("Size :" + circleSet.size());
        System.out.println("=====================================");
    }
}
