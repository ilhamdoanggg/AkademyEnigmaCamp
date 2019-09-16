import com.enigma.model.Role;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to MMORPG Game calculator");
    System.out.println("1. Tank 2. Arcer 3. Mage ");
    System.out.println("4. Assasin 5. Warior 5.Crusaider " );
    System.out.print("Choose class Hero :");
    String titik = br.readLine();
    Integer value = Integer.parseInt(titik);

    System.out.print("Choose Level Hero :");
    String level = br.readLine();
    Integer levell = Integer.parseInt(level);

    Role pahlawan = new Role(0,0,levell,0,0, value);
        System.out.println(pahlawan.getClassHero(value));




//    Integer values = Integer.parseInt(value[0]), Integer.parseInt(value[1]), Integer.parseInt(value[2]), Integer.parseInt(value[3]),Integer.parseInt(value[4]);

/*

        System.out.print("Choose Level Hero :");
        String  levelChoose = br.readLine();
        Integer level =Integer.parseInt(levelChoose);
*/

//    System.out.println(pahlawan.print());
    }
}
