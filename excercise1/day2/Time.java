// import java.util.Date;
import java.util.Scanner;

public class Time{
    public static void main(String[] args) {
        // Date date = new Date();
        // System.out.println(date.toString());
    String[] buah = new String[5];
    Scanner scan = new Scanner(System.in);


    for (int i=0;i<buah.length ;i++ ) {
    	System.out.print("bauh data ke "+ i + ":");
    	buah[i] = scan.nextLine();
    }
    System.out.println("________________");
    for (String b : bauh) {
    	System.out.println(b);
    }
    }

}